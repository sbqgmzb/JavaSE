package day05_javaSE.day05_moviesys;

public class MovieOperator {
    private Movie [] movies;
    public MovieOperator(Movie [] movies) {
        this.movies = movies;
    }
    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++){
            System.out.println("编号："+movies[i].getId());
            System.out.println("名称："+movies[i].getName());
            System.out.println("价格："+movies[i].getPrice());
            System.out.println("=======================");
        }
    }

    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("电影信息如下：");
                System.out.println("编号" + movies[i].getId());
                System.out.println("名称" + movies[i].getName());
                System.out.println("价格" + movies[i].getPrice());
                System.out.println("得分" + movies[i].getScore());
                System.out.println("导演" + movies[i].getDirector());
                System.out.println("主演" + movies[i].getActor());
                System.out.println("简介" + movies[i].getInfo());
                return;
            }
        }
        System.out.println("无");
    }
}
