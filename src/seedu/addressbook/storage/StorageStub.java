package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub extends Storage{
    
    public StorageStub(){
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
    }

    @Override
    public String getPath() {
        return null;
    }
    
}
