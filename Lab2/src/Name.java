// Задание 1.3

public class Name {
    private String surname;
    private String firstName;
    private String patronymic;

    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String toString() {
        String st = "";
        if (surname != null) {
            st += surname + " ";
        }
        if (firstName != null) {
            st += firstName + " ";
        }
        if (patronymic != null) {
            st += patronymic + " ";
        }
        return st.trim();
    }
}
