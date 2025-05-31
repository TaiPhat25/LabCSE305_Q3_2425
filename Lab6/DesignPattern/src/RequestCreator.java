public abstract class RequestCreator {
    public abstract requestProduct createRequest();

    public void processRequest(requestProduct request) {
        request.processRequest();
    }
}
