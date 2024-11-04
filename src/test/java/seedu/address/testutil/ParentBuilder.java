package seedu.address.testutil;

import seedu.address.model.person.Name;
import seedu.address.model.person.Parent;

/**
 * A utility class to help with building Parent objects.
 */
public class ParentBuilder extends PersonBuilder {

    private Name childName;

    /**
     * Creates a {@code ParentBuilder} with the default details.
     */
    public ParentBuilder() {
        super();
        childName = null;
    }

    /**
     * Initializes the ParentBuilder with the data of {@code parentToCopy}.
     */
    public ParentBuilder(Parent parentToCopy) {
        super(parentToCopy);
        childName = parentToCopy.getChildName();
    }

    /**
     * Sets the {@code child} of the {@code Parent} that we are building.
     */
    public ParentBuilder withChild(Name childName) {
        this.childName = childName;
        return this;
    }

    @Override
    public ParentBuilder withName(String name) {
        super.withName(name);
        return this;
    }

    @Override
    public ParentBuilder withPhone(String phone) {
        super.withPhone(phone);
        return this;
    }

    @Override
    public ParentBuilder withEmail(String email) {
        super.withEmail(email);
        return this;
    }

    @Override
    public ParentBuilder withAddress(String address) {
        super.withAddress(address);
        return this;
    }

    @Override
    public ParentBuilder withTags(String... tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Builds the parent.
     */
    public Parent build() {
        return new Parent(getName(), getPhone(), getEmail(), getAddress(), childName, getTags(),
                isPinned(), isArchived());
    }

}
