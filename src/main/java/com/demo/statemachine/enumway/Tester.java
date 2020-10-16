package com.demo.statemachine.enumway;

public class Tester {
    public static void main(String[] args) {
        //Below if conditions to be executed based on
        if("MEDB".equalsIgnoreCase("MEDB")){
            //
            MEDBProcessStateFlow medbFlow = ApplicationSelector.MEDB.getMEDBProcessStateFlow();
            //initial state
            System.out.println("------Start MEDB CREATE_APP--------");
            System.out.println("currentStep:: "+ medbFlow.currentStep());
            System.out.println("nextStep:: " + medbFlow.nextStep());
            System.out.println("previousStep:: " + medbFlow.previousStep());
            System.out.println("------End MEDB CREATE_APP--------");
            //DUP_APP_CHECK
            medbFlow = medbFlow.nextStep();
            System.out.println("------Start MEDB DUP_APP_CHECK--------");
            System.out.println("currentStep:: "+ medbFlow.currentStep());
            System.out.println("nextStep:: " + medbFlow.nextStep());
            System.out.println("previousStep:: " + medbFlow.previousStep());
            System.out.println("------End MEDB DUP_APP_CHECK--------");
            MEDBProcessStateFlow medbDirectFlow = MEDBProcessStateFlow.ACCOUNT_FULFILMENT;
            System.out.println("------Start MEDB ACCOUNT_FULFILMENT--------");
            System.out.println("currentStep:: "+ medbDirectFlow.currentStep());
            System.out.println("nextStep:: " + medbDirectFlow.nextStep());
            System.out.println("previousStep:: " + medbDirectFlow.previousStep());
            System.out.println("------End MEDB ACCOUNT_FULFILMENT--------");
        }
        if("NIKE".equalsIgnoreCase("NIKE")){
            NikeProcessStateFlow nikeFlow = ApplicationSelector.NIKE.getNikeProcessStateFlow();
            //initial CREATE_APP
            System.out.println("------Start Nike CREATE_APP--------");
            System.out.println("currentStep:: "+ nikeFlow.currentStep());
            System.out.println("nextStep:: " + nikeFlow.nextStep());
            System.out.println("previousStep:: " + nikeFlow.previousStep());
            System.out.println("------End Nike CREATE_APP--------");
            //DUP_APP_CHECK
            nikeFlow = nikeFlow.nextStep();
            System.out.println("------Start Nike DUP_APP_CHECK--------");
            System.out.println("currentStep:: "+ nikeFlow.currentStep());
            System.out.println("nextStep:: " + nikeFlow.nextStep());
            System.out.println("previousStep:: " + nikeFlow.previousStep());
            System.out.println("------End Nike DUP_APP_CHECK--------");
            NikeProcessStateFlow nikeDirectFlow = NikeProcessStateFlow.ACCOUNT_FULFILMENT;
            System.out.println("------Start Nike ACCOUNT_FULFILMENT--------");
            System.out.println("currentStep:: "+ nikeDirectFlow.currentStep());
            System.out.println("nextStep:: " + nikeDirectFlow.nextStep());
            System.out.println("previousStep:: " + nikeDirectFlow.previousStep());
            System.out.println("------End Nike ACCOUNT_FULFILMENT--------");

        }
    }
}
