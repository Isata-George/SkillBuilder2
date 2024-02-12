
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    private final static int DEFAULT_POWER = 10;
    // instance variables
    int power = DEFAULT_POWER;
    String name;

    // constructors

    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name)
    {
        this.name = name;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power)
    {
        this.name = name;
        this.power = power;
    }

    // accessor methods

    /**
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return the power value
     */
    public int getPower()
    {
        return power;
    }


    // mutator methods

    /**
     *
     * @param name sets the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * @param power sets the power
     */
    public void setPower(int power)
    {
        this.power = power;
    }

    // toString method

    public String toString()
    {
        return ("PowerPill " + name + " = " + power);
    }

}