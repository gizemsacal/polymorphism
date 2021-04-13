public class Main {

    public static void main(String[] args) {
//BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaselLogger()};
//
//for (BaseLogger logger : loggers){
//    logger.Log("Log mesajı");
//}
        CustomerManager customerMaanger= new CustomerManager(new DatabaselLogger());
        customerMaanger.add();
    }
}
