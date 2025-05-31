public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public static class LowPriorityConcreteCreator extends RequestCreator {
        @Override
        public RequestProduct createRequest() {
            // TODO Auto-generated method stub
            return new LowPriorityConcrete();
        }
    }

    public static class MediumPriorityConcreteCreator extends RequestCreator {
        @Override
        public RequestProduct createRequest() {
            // TODO Auto-generated method stub
            return new MediumPriorityConcrete();
        }
    }

    public static class HighPriorityConcreteCreator extends RequestCreator {
        @Override
        public RequestProduct createRequest() {
            // TODO Auto-generated method stub
            return new HighPriorityConcrete();
        }
    }
}
