class Voting {
    String votersName;
    int votersId;

    void castVote() {
        System.out.println("The voter is casting the vote");
    }

    void withdrawCasting() {
        System.out.println("The voter doesn't vote");
    }

    // Getter methods to access private variables
    String getVotersName() {
        return votersName;
    }

    int getVotersId() {
        return votersId;
    }

    // Setter methods to modify private variables
    void setVotersName(String name) {
        votersName = name;
    }

    void setVotersId(int id) {
        votersId = id;
    }
}

public class Main {
    public static void main(String[] args) {
        Voting V1 = new Voting();
        Voting V2 = new Voting();

        V1.setVotersName("Arun");
        V2.setVotersName("Varun");
        V1.setVotersId(60);
        V2.setVotersId(100);

        System.out.println("Voter name: " + V1.getVotersName());
        System.out.println("Voter id: " + V1.getVotersId());
        System.out.println("Voter name: " + V2.getVotersName());
        System.out.println("Voter id: " + V2.getVotersId());

        V1.castVote();
        V1.withdrawCasting();
    }
}
