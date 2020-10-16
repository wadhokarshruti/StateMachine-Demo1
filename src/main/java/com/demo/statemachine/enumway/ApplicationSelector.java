package com.demo.statemachine.enumway;

public enum ApplicationSelector {
    MEDB{
        @Override
        public MEDBProcessStateFlow getMEDBProcessStateFlow() {
            return MEDBProcessStateFlow.CREATE_APP;
        }

        @Override
        public NikeProcessStateFlow getNikeProcessStateFlow() {
            return null;
        }
    },
    NIKE{
        @Override
        public MEDBProcessStateFlow getMEDBProcessStateFlow() {
            return null;
        }

        @Override
        public NikeProcessStateFlow getNikeProcessStateFlow() {
            return NikeProcessStateFlow.CREATE_APP;
        }
    };
    public abstract MEDBProcessStateFlow getMEDBProcessStateFlow();
    public abstract NikeProcessStateFlow getNikeProcessStateFlow();
}
