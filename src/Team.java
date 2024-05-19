public class Team {
    String name;
    int power;
    int winCount = 0;
    int drawCount = 0;
    int loseCount = 0;
    int GF = 0; // atilan
    int GA = 0; // yenilen
    int GD = 0; // avaraj

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGA() {
        return GA;
    }

    public void setGA(int GA) {
        this.GA = GA;
    }

    public int getGD() {
        return GD;
    }

    public void setGD(int GD) {
        this.GD = GD;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    int point;

    public Team(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String toString(){
        String teamInfo = "";
        teamInfo = getName() + " | Win:" + getWinCount() + " | Draw:" + getDrawCount() +
                " | Lose:" +  getLoseCount() + " | GF:" + (getGA() + getGD()) + " | GA:" + getGA() + " | GD:" + getGD() +
                " | Point:" + getPoint();

        return teamInfo;
    }
}
