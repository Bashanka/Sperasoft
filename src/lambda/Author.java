package lambda;

class Author {

    public String firstName;
    public String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String authorsFullName() {
        return firstName + " " + lastName;
    }

    public void printAuthorsFullName() {
        System.out.println(authorsFullName());
    }

}
