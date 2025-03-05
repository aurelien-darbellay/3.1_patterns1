import Agenda.AgendaEntry;
import Agenda.AgendaManager;
import Agenda.EntriesFactory.Adresses.FrenchAddress;
import Agenda.EntriesFactory.Adresses.FrenchAddressCreator;
import Agenda.EntriesFactory.Adresses.SpanishAddress;
import Agenda.EntriesFactory.Adresses.SpanishAddressCreator;
import Agenda.EntriesFactory.PhoneNumbers.FrenchPhoneNumber;
import Agenda.EntriesFactory.PhoneNumbers.FrenchPhoneNumberCreator;
import Agenda.EntriesFactory.PhoneNumbers.SpanishPhoneNumberCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AgendaManager.start();
        AgendaEntry newFrenchAdress = FrenchAddressCreator.createAddress(
                "Aurélien",
                "rue des bosses",
                75,
                "",
                "Ain",
                "22100",
                "Ain-la-ville");
        AgendaEntry newFrenchNumber = FrenchPhoneNumberCreator.createPhoneNumber("Aurélien", "778965452");
        AgendaEntry newSpanishAddress = SpanishAddressCreator.createAddress(
                "María",
                "plaza",
                "san lazaro",
                82,
                "entr.",
                1,
                "",
                "08032",
                "Barcelona",
                "Barcelona"
                );
        AgendaEntry newSpanishNumber = SpanishPhoneNumberCreator.createPhoneNumber("María", "626543366");
        AgendaManager.addEntry(newFrenchAdress);
        AgendaManager.addEntry(newFrenchNumber);
        AgendaManager.addEntry(newSpanishAddress);
        AgendaManager.addEntry(newSpanishNumber);
        AgendaManager.showEntries();
    }
}