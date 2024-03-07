class Patient extends Person {
    private String condition;

    public Patient(String name, int age, String condition) {
        super (name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Condition: " + condition);
    }
}


class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super (name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}


class main{
    public static void main(String[] args) {
        Patient patient = new Patient("Mark", 25, "headache");
        System.out.println("********Patient*********");
        patient.setCondition("headache");
        System.out.println("Patient's Name: " + patient.getName() + "\n"
                + "Age: " + patient.getAge() + "\n"
                + "Updated Patient's Condition: " + patient.getCondition());
        patient.displayDetails();

        Doctor doctor = new Doctor("Johnny", 58, "surgery");
        System.out.println("********Doctor*********");
        doctor.setSpecialization("surgery");
        System.out.println("Doctor's Name: " + doctor.getName() + "\n"
                + "Age: " + doctor.getAge() + "\n"
                + "Updated Doctor's Specialization: " + doctor.getSpecialization());
        doctor.displayDetails();
    }
}