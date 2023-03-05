public class HeadMaster {
    private int headMasterId;
    private String headMasterName;
    private TuitionCenter tuitionCenter;

    // Constructor
    public HeadMaster(int headMasterId, String headMasterName, TuitionCenter tuitionCenter) {
        this.headMasterId = headMasterId;
        this.headMasterName = headMasterName;
        this.tuitionCenter = tuitionCenter;
    }

    // Getters and setters
    public int getHeadMasterId() {
        return headMasterId;
    }

    public void setHeadMasterId(int headMasterId) {
        this.headMasterId = headMasterId;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }

    public TuitionCenter getTuitionCenter() {
        return tuitionCenter;
    }

    public void setTuitionCenter(TuitionCenter tuitionCenter) {
        this.tuitionCenter = tuitionCenter;
    }
}
