

public class Coin {
    private double rate;
    private String coin;
    public Coin(String coin){
        super();
        if (coin == null){
            throw new IllegalArgumentException("coin not valid");
        }
        this.rate = (Math.random()*20) -10;;
        this.coin = coin;
    }

    public Coin(double rate, String coin){
        if (rate >= 1000 || rate <= -1000){
            throw new IllegalArgumentException("rate not valid");
        }
        if (coin == null){
            throw new IllegalArgumentException("coin not valid");
        }
        this.rate = rate;
        this.coin = coin;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getCoin() {
        return coin;
    }

    public double getRate() {
        return rate;
    }
}
