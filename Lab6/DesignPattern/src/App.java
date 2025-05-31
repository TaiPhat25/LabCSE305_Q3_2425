public class App {
    public static void main(String[] args) throws Exception {
        RequestCreator lowCreator = new lowPriorityConcreteCreator();
        lowCreator.createRequest().processRequest();
        RequestCreator midCreator = new midPriorityConcreteCreator();
        midCreator.createRequest().processRequest();
        RequestCreator highCreator = new highPriorityConcreteCreator();
        highCreator.createRequest().processRequest();
    }
}