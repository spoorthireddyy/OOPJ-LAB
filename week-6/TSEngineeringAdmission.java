class NotEligibleForEngineering extends RuntimeException {
    NotEligibleForEngineering(String s) {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException {
    NotEligibleForVJIT(String s) {
        super(s);
    }
}

class TSEngineeringAdmission {
    public static void main(String args[]) {
        try {
            int score = Integer.parseInt(args[0]);

            if (score < 50) {
                throw new NotEligibleForEngineering("Not Eligible For Engineering. Score is less than 50");
            } 
            else if (score < 70) {
                throw new NotEligibleForVJIT("Not Eligible For VJIT. Score is less than 70");
            } 
            else {
                System.out.println("Welcome to VJIT-Thanks For Your Registration!");
            }
        } 
        catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("Rest of the Code");
    }
}