package Agenda;

import Agenda.EntriesFactory.Adresses.Address;
import Agenda.EntriesFactory.AgendaEntryFactory;
import Agenda.EntriesFactory.FactoryProducer;
import Agenda.EntriesFactory.PhoneNumbers.PhoneNumber;


public class AgendaManager {

    private static Agenda MY_AGENDA;

    public static final AgendaEntryFactory MY_ADDRESS_FACTORY = FactoryProducer.getFactory(Agenda.EntryType.ADDRESS);
    public static final AgendaEntryFactory MY_NUMBER_FACTORY = FactoryProducer.getFactory(Agenda.EntryType.PHONE_NUMBER);

    public static void start() {
        MY_AGENDA = new Agenda();
    }
    public static void showEntries(){
        int index = 0;
        for (AgendaEntry entry : MY_AGENDA.getEntries()){
            index++;
            String entryType = entry instanceof Address ? " an address" : "a phone number";
            System.out.println("Entry number " + index + " is " + entryType);
            System.out.println("It belongs to " + entry.getPersoneName() + " who lives in " + entry.getCountry());
            if (entry instanceof Address){
                System.out.println("The address is: ");
                ((Address) entry).printAddress();
            }else {
                System.out.println("The number is: ");
                System.out.println(((PhoneNumber) entry).getInternationalNumber());
            }
        }

    }
    public static void addEntry(AgendaEntry entry){
        MY_AGENDA.addEntry(entry);
    }
}
