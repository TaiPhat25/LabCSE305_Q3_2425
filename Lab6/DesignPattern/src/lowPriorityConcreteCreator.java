public class lowPriorityConcreteCreator extends RequestCreator {
    public requestProduct createRequest() {
        return new lowPriorityConcrete();
    }
}
