public class highPriorityConcreteCreator extends RequestCreator {
    @Override
    public requestProduct createRequest() {
        return new highPriorityConcrete();
    }
}