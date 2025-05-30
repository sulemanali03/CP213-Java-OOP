package cp213;

/**
 * Base class in simple example of inheritance / polymorphism.
 *
 * @author Name
 * @version 2022-02-25
 */
public class Person implements Comparable<Person> {

    protected String firstName = null;

    protected String lastName = null;

    /**
     * Person constructor.
     *
     * @param lastName  Person last name (surname)
     * @param firstName Person first name (given name)
     */
    public Person(final String lastName, final String firstName) {
	this.lastName = lastName;
	this.firstName = firstName;
    }

    @Override
    public int compareTo(final Person person) {
	// Compares two Person objects by lastName then firstName.

	int flag = this.lastName.compareTo(person.lastName);

	if (flag == 0) {
	    // last names are the same - compare first names.
	    flag = this.firstName.compareTo(person.firstName);
	}
	return flag;
    }

    /**
     * Getter for firstName.
     *
     * @return this.firstName
     */
    public String getFirstName() {
	return this.firstName;
    }

    /**
     * Getter for lastName.
     *
     * @return this.lastName
     */
    public String getLastName() {
	return this.lastName;
    }

    /**
     * Creates formatted string version of Person.
     */
    @Override
    public String toString() {
	return (this.lastName + ", " + this.firstName);
    }
}