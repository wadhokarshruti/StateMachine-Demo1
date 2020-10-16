package com.demo.statemachine.enumway;

public enum MEDBProcessStateFlow {
    CREATE_APP{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return null;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return CREATE_APP;
        }
    },
    DUP_APP_CHECK{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return GET_ELIGIBLE_PROD;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return CREATE_APP;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return DUP_APP_CHECK;
        }
    },
    GET_ELIGIBLE_PROD{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return DUP_CUSTOMER_CHECK;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return GET_ELIGIBLE_PROD;
        }
    },
    DUP_CUSTOMER_CHECK {
        @Override
        public MEDBProcessStateFlow nextStep() {
            return UPDATE_APP;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return DUP_APP_CHECK;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return DUP_CUSTOMER_CHECK;
        }
    },
    UPDATE_APP {
        @Override
        public MEDBProcessStateFlow nextStep() {
            return CREATE_CUSTOMER;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return DUP_CUSTOMER_CHECK;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return UPDATE_APP;
        }
    },
    CREATE_CUSTOMER{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return IB_REGO;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return UPDATE_APP;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return CREATE_CUSTOMER;
        }
    },
    IB_REGO{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return null;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return CREATE_CUSTOMER;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return IB_REGO;
        }
    },
    ACCOUNT_FULFILMENT{
        @Override
        public MEDBProcessStateFlow nextStep() {
            return null;
        }

        @Override
        public MEDBProcessStateFlow previousStep() {
            return IB_REGO;
        }

        @Override
        public MEDBProcessStateFlow currentStep() {
            return ACCOUNT_FULFILMENT;
        }
    };
    public abstract MEDBProcessStateFlow nextStep();
    public abstract MEDBProcessStateFlow previousStep();
    public abstract MEDBProcessStateFlow currentStep();

}
