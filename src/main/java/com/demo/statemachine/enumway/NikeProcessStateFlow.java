package com.demo.statemachine.enumway;

public enum NikeProcessStateFlow {
    CREATE_APP{
        @Override
        public NikeProcessStateFlow nextStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return null;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return CREATE_APP;
        }
    },
    DUP_APP_CHECK{
        @Override
        public NikeProcessStateFlow nextStep() {
            return GET_ELIGIBLE_PROD;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return CREATE_APP;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return DUP_APP_CHECK;
        }
    },
    GET_ELIGIBLE_PROD{
        @Override
        public NikeProcessStateFlow nextStep() {
            return DUP_CUSTOMER_CHECK;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return GET_ELIGIBLE_PROD;
        }
    },
    DUP_CUSTOMER_CHECK {
        @Override
        public NikeProcessStateFlow nextStep() {
            return UPDATE_APP;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return DUP_CUSTOMER_CHECK;
        }
    },
    UPDATE_APP {
        @Override
        public NikeProcessStateFlow nextStep() {
            return CREATE_CUSTOMER;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return DUP_CUSTOMER_CHECK;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return UPDATE_APP;
        }
    },
    CREATE_CUSTOMER{
        @Override
        public NikeProcessStateFlow nextStep() {
            return IB_REGO;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return UPDATE_APP;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return CREATE_CUSTOMER;
        }
    },
    IB_REGO{
        @Override
        public NikeProcessStateFlow nextStep() {
            return null;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return CREATE_CUSTOMER;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return IB_REGO;
        }
    },
    ACCOUNT_FULFILMENT{
        @Override
        public NikeProcessStateFlow nextStep() {
            return null;
        }

        @Override
        public NikeProcessStateFlow previousStep() {
            return IB_REGO;
        }

        @Override
        public NikeProcessStateFlow currentStep() {
            return ACCOUNT_FULFILMENT;
        }
    };
    public abstract NikeProcessStateFlow nextStep();
    public abstract NikeProcessStateFlow previousStep();
    public abstract NikeProcessStateFlow currentStep();

}
