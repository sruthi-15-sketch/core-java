import java.util.Arrays;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
}

class IndianPhoneNumber extends PhoneNumber {
    IndianPhoneNumber(String countryCode, String phNo) {
        super(countryCode, phNo);
    }
}

class PersonalDetails {
    String firstName;
    String lastName;
    String email;
    String password;
    PhoneNumber[] phoneNo;
    String[] date;

    public PersonalDetails(String firstName, String lastName, String email, String password,
            PhoneNumber[] phoneNo, String[] date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PhoneNumber[] getPhoneNumber() {
        return phoneNo;
    }

    public void setPhoneNumber(PhoneNumber[] phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String[] getDate() {
        return date;
    }

    public void setDate(String[] date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PersonalDetails [date=" + Arrays.toString(date) + ", email=" + email + ", firstName=" + firstName
                + ", lastName=" + lastName + ", password=" + password + ", phoneNo=" + Arrays.toString(phoneNo) + "]";
    }

    public void validate()
            throws IllegalArgumentException {
        if ((!isValidName(this.firstName)) && (!isValidName(this.lastName)))
            throw new IllegalArgumentException("First name and Last name must only contain alphabets");
        if (!isValidEmail(this.email))
            throw new IllegalArgumentException(
                    "Email nomenclature is missing . See that it contains '@','.' and no spaces");
        /*
         * if (!isValidPhoneNo(phoneNo)) {
         * for (int i = 0; i < this.phoneNo.length; i++) {
         * if (!isValidPhoneNo(getPhoneNumber())) {
         * throw new IllegalArgumentException("Phone No must be of 10 digits");
         * }
         * }
         * }
         */
        if (!isValidPassword(this.password))
            throw new IllegalArgumentException(
                    "The length of password should be between 8 to 16 charcaters and it must include atleat one digit");
        if (!isValidDate(this.date))
            throw new IllegalArgumentException("Not a valid date!");
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && (!email.contains(" "));
    }

    public static boolean isValidPhoneNo(PhoneNumber[] phone) {
        for (int j = 0; j < phone.length; j++) {
            String s = phone[j].phNo;
            if (s.length() != 10) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) >= '9'))
                    return false;
            }
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        int n = password.length();
        if ((n < 8) || (n > 16))
            return false;
        else {
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                    flag = 1;
            }
            if (flag == 1)
                return true;
        }
        return false;
    }

    public static boolean isValidName(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDate(String[] str) {
        if (!(Integer.parseInt(str[0]) >= 1 && Integer.parseInt(str[0]) <= 31)) {
            return false;
        }
        if (!(Integer.parseInt(str[1]) >= 1 && Integer.parseInt(str[1]) <= 12)) {
            return false;
        }
        if (!(Integer.parseInt(str[2]) >= 1900 && Integer.parseInt(str[2]) <= 2009)) {
            return false;
        }
        return true;
    }
}

class MainException {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("+91", "7793948712");
        PhoneNumber p2 = new PhoneNumber("+91", "8907612345");
        PhoneNumber[] phoneNumber = { p1, p2 };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String weekday = dayNames[cal.get(Calendar.DAY_OF_WEEK)];
        String pDate = year + "-" + month + "-" + day + " " + weekday;
        PersonalDetails pd = new PersonalDetails("Sruthi1", "Boddu", "sruthi1502@gmail.com", "123456@33", phoneNumber,
                new String[] { "23", "02", "1899" });
        try {
            pd.validate();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // System.out.println(pd);
    }
}