package day05_javaSE.day05_moviesys;

public class Text {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        //创建4个电影对象，分别存储到movies数组中
        movies[0] = new Movie(1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看");
        movies[1] = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看");
        movies[2] = new Movie(3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看");
        movies[3] = new Movie(4,"一点就到家", 35, 8.7, "许宏宇", "刘昊然","10.8万人想看");
        MovieOperator movieOperator=new MovieOperator(movies);
        movieOperator.printAllMovies();
        movieOperator.searchMovieById(2);
    }
}
