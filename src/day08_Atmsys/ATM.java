package day08_Atmsys;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
    //存储账户的集合
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account loginAcc;

    /* 启动后有个欢迎界面,有命令，所以一直循环进行 */
    public void start() {
        while (true) {
            System.out.println("==欢迎来到ATM系统==");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择你的操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 用户登录
                    //System.out.println("进入登录功能");
                    login();
                    break;
                case 2:
                    // 用户开户
                    //System.out.println("进入开户功能");
                    creatAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /* 开户功能 */
    private void creatAccount() {
        System.out.println("==系统开户==");
        //1、创建一个对象，封装数据
        Account account = new Account();
        //2、用户输入账号信息
        account.setCardId(creatCardId());

        System.out.println("请输入账户名称：");
        account.setUserName(sc.next());

        while (true) {
            System.out.println("请输入你的性别：");
            char gender = sc.next().charAt(0);
            if (gender == '男' || gender == '女') {
                account.setGender(gender);
                break;
            } else {
                System.out.println("输入错误，重新输入");
            }

        }

        while (true) {
            System.out.println("请输入你的密码：");
            String password = sc.next();

            System.out.println("请再次输入密码：");
            String psd = sc.next();
            if (password.equals(psd)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次密码不一样，请重新输入。");
            }
        }
        System.out.println("请输入取现金额：");
        account.setLimit(sc.nextDouble());

        //3、账号存入集合当中
        accounts.add(account);
        System.out.println(account.getUserName()
                + "开户成功，您的卡号是：" + account.getCardId());


    }

    //创建卡号，随机创建、不能重复
    private String creatCardId() {
        String cardId = "";
        while (true) {
            for (int i = 0; i < 8; i++) {
                Random r = new Random();
                cardId += r.nextInt(10);
            }
            Account acc = getAccountCardId(cardId);
            if (acc == null) {
                return cardId;
            }
        }
    }

    //根据id查询账户
    private Account getAccountCardId(String cardId) {
        for (Account acc : accounts) {
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

    /*
     * 用户登录界面
     */
    private void login() {
        if (accounts.isEmpty()) {
            System.out.println("目前没有账户，请先开户！");
            return;
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.nextLine();
            Account acc = getAccountCardId(cardId);
            if (acc == null) {
                System.out.println("未找到该卡号请重新输入。");
            } else {
                while (true) {
                    System.out.println("请输入账号密码：");
                    String password = sc.next();
                    System.out.println("请再次输入密码：");
                    String psw = sc.next();
                    if (password.equals(psw)) {
                        if (password.equals(acc.getPassword())) {
                            System.out.println(acc.getUserName() + "成功登录系统，您的卡号是：" + acc.getCardId());
                            loginAcc = acc;
                            showUserCommand();
                            return;
                        } else {
                            System.out.println("密码输入错误，请重新输入！");
                        }
                    } else {
                        System.out.println("两次输入密码不一致，请重新输入密码。");
                    }
                }
            }

        }
    }

    /*
     * 展示登录后的操作界面的
     */
    private void showUserCommand() {
        while (true) {
            System.out.println("==============================");
            System.out.println(loginAcc.getUserName() + "，您可以选择如下功能进行账户的处理：");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    showLoginAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    drawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    updatePassWord();
                    return;// 跳出并结束当前方法
                case 6:
                    System.out.println(loginAcc.getUserName() + "您退出系统成功！");
                    return; // 跳出并结束当前方法
                case 7:
                    if (deleteAccount()) {
                        start();
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前选择的操作是不存在的，请确认~~");
            }
        }
    }


    /*
     * 查询当前账户信息
     */
    private void showLoginAccount() {
        System.out.println("==当前您的账户信息如下：==");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("性别：" + loginAcc.getGender());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
    }

    /*
     * 存款
     */
    private void depositMoney() {
        System.out.println("请输入你想要存入的金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(money + loginAcc.getMoney());
        System.out.println("存款成功！您的账户与余额为：" + loginAcc.getMoney());
    }

    /*
     * 取款
     */
    private void drawMoney() {
        while (true) {
            if (loginAcc.getMoney() < 100) {
                System.out.println("您的余额不足100元，无法再取出金额！余额：" + loginAcc.getMoney());
                return;
            }
            System.out.println("请输入您要取出的金额：");
            double money = sc.nextDouble();
            if (money > loginAcc.getLimit()) {
                System.out.println("每次只能取" + loginAcc.getLimit() + "限额的钱");
            } else {
                if (money > loginAcc.getMoney())
                    System.out.println("您的余额不足，为" + loginAcc.getMoney() + "元，请重新输入金额。");
                else {
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("取出成功，余额为：" + loginAcc.getMoney());
                    return;
                }
            }
        }
    }

    /*
     * 转账
     */
    private void transferMoney() {
        //1、判断系统是否有其他账户
        if (accounts.size() == 1) {
            System.out.println("该系统没有其他账户，请开户。");
            return;
        }
        //2、判断自己有没有钱
        if (loginAcc.getMoney() == 0) {
            System.out.println("余额为0，无法转账！");
            return;
        }
        //把真正可以执行的并且需要循环的代码放入！！！！
        while (true) {
            System.out.println("请输入对方的卡号信息：");
            String theCardId = sc.next();
            Account acc = getAccountCardId(theCardId);
            if (acc == null) {
                System.out.println("您输入的卡号不存在！");
            } else {
                System.out.println("请输入对方的姓氏：");
                char firstName = sc.next().charAt(0);
                if (firstName == acc.getUserName().charAt(0)) {
                    while (true) {
                        System.out.println("请输入您要转账的余额：");
                        double money = sc.nextDouble();
                        if (money <= loginAcc.getMoney()) {
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            acc.setMoney(acc.getMoney() + money);
                            System.out.println("您转账成功！");
                            return;

                        } else {
                            System.out.println("您的余额不足，为" + loginAcc.getMoney() + "元，转账失败!");
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的姓氏有问题，转账失败！");
                    return;
                }
            }
        }

    }


    /*
     * 修改密码
     */
    private void updatePassWord() {
        while (true) {
            System.out.println("请输入当前帐号密码：");
            String password = sc.next();
            if (loginAcc.getPassword().equals(password)) {
                System.out.println("请输入新的密码：");
                String psw1 = sc.next();
                System.out.println("请再次输入密码：");
                String psw2 = sc.next();
                if (psw1.equals(psw2)) {
                    loginAcc.setPassword(psw1);
                    System.out.println("修改成功！");
                    return;
                } else {
                    System.out.println("输入的密码不一致，请重新输入！");
                }
            } else {
                System.out.println("您输入的密码错误请再次输入");
            }
        }

    }

    /*
     * 注销
     */
    private boolean deleteAccount() {
        System.out.println("是否决定注销？（y/n）：");
        String answer = sc.next();
        if (answer.equals("y")) {
            if (loginAcc.getMoney() == 0) {
                accounts.remove(loginAcc);
                System.out.println("销户成功！");
                return true;
            } else {
                System.out.println("您的账号存在余额，无法注销。");
                return false;
            }
        } else {
            System.out.println("好的，您的账户保留！！");
            return false;
        }
    }
}
