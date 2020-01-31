package blockchain;

public class Main {
    public static void main(String[] args) {
        blockChain myBlockChain = new blockChain();
        for (int i = 0; i < 5; i++) {
            myBlockChain.p();
            myBlockChain.add();
        }
    }
}
