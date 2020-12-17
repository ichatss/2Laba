public class CalSig {
    private Character sign;
    private int lvl;

    public CalSig() {
        lvl = 8;
    }

    public CalSig(Character sign) {
        this.sign = sign;
        switch (this.sign) {
            case '+': case '-':
                lvl = 2;
                break;
            case '*': case '/':
                lvl = 1;
                break;
            case '(':
                lvl = 3;
                break;
            case ')':
                lvl = 4;
                break;
        }
    }

    public Character getSign() {
        return sign;
    }

    public int getLvl() {
        return lvl;
    }


}
