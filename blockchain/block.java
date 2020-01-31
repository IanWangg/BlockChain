package blockchain;

public class block {
    private long timeStamp;
    private int Id;
    private String preHash;
    private String hash;
    private blockChain preBlock;
    private String data;

    public block(int Id, String preHash, long timeStamp) {
        this.Id = Id;
        this.preHash = preHash;
        this.timeStamp = timeStamp;
        this.hash = calculateHash(Id, preHash, timeStamp);
        this.data = "Block: " + "\n" + "Id: " + Id +
                "\n" + "Timestamp: " + timeStamp + "\n" + "Hash of the previous block: \n" + preHash + "\n" +
                "Hash of the block: \n" + this.hash + "\n";
    }


    private String calculateHash(int index, String previousHash, long timestamp) {
        StringBuilder builder = new StringBuilder(index);
        builder.append(previousHash).append(timestamp);
        return StringUtil.applySha256(builder.toString());
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getData() {
        return data;
    }
}
