package blockchain;

import java.util.ArrayList;
import java.util.Date;

public class blockChain {
    private ArrayList<block> chain;

    public blockChain(){
        this.chain = new ArrayList<block>();
        this.chain.add(new block(1, "0", new Date().getTime()));
    }

    public blockChain add() {
        block last = chain.get(chain.size() - 1);
        block cur = new block(last.getId() + 1, last.getHash(), new Date().getTime());
        this.chain.add(cur);
        return this;
    }

    public boolean validate() {

        return true;
    }

    public boolean printLast() {
        block last = chain.get(chain.size() - 1);
        System.out.println("Block:");
        System.out.println("Id: " + last.getId());
        System.out.println("Timestamp: " + last.getTimeStamp());
        System.out.println("Hash of the previous block: ");
        System.out.println(last.getPreHash());
        System.out.println("Hash of the block: ");
        System.out.println(last.getHash());
        System.out.println(" ");
        return true;
    }

    public boolean p() {
        block last = chain.get(chain.size() - 1);
        System.out.println(last.getData());
        return true;
    }
}


