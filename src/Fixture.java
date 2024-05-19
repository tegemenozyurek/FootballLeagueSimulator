

public class Fixture {
    int[] homeIndex;
    int[] awayIndex;

    public Fixture(int teamCount) {
        int totalMatches = teamCount * (teamCount - 1);
        this.homeIndex = new int[totalMatches];
        this.awayIndex = new int[totalMatches];
        generateMatches(teamCount);
    }

    public void generateMatches(int teamCount) {
        int matchCount = 0;
        for (int i = 0; i < teamCount; i++) {
            for (int j = 0; j < teamCount; j++) {
                if (i != j) {
                    this.homeIndex[matchCount] = i;
                    this.awayIndex[matchCount] = j;
                    matchCount++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 20 takım için Fixture objesi oluştur
        Fixture fixture = new Fixture(20);

        // Oluşturulan maçları ekrana yazdır
        System.out.println("Oluşturulan Maçlar:");
        for (int k = 0; k < fixture.homeIndex.length; k++) {
            System.out.println("Maç " + (k + 1) + ": Takım " + fixture.homeIndex[k] + " vs Takım " + fixture.awayIndex[k]);
        }
    }
}
