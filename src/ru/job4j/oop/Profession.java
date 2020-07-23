package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public int getBirthday() {
        return birthday;
    }
    public class Engineer extends Profession {
        private String algorithm;
        public String getAlgorithm() {
            return algorithm;
        }
    }
    public class Doctor extends Profession {
        private String diagnosis;
        public String getDiagnosis() {
            return diagnosis;
        }
    }
    public class Programmer extends Engineer {
        private String techTask;
        public String getTechTask() {
            return techTask;
        }
    }
    public class Builder extends Engineer {
        private String design;
        public String getDesign() {
            return design;
        }
    }
    public class Surgeon extends Doctor {
        private int surgeonDate;
        public int getSurgeonDate() {
            return surgeonDate;
        }
    }
    public class Dentist extends Doctor {
        private String jawXRay;
        public String getJawXRay() {
            return jawXRay;
        }
    }
}
