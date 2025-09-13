

class Course {
    protected String courseName;
    protected int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Status: Basic Course Info");
    }
}


class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
        System.out.println("Status: Online Course");
    }
}


class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Fee after Discount: $" + discountedFee);
        System.out.println("Status: Paid Online Course");
        System.out.println("-----------------------------");
    }
}
