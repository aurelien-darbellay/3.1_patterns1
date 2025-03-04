package Agenda.EntriesFactory.Adresses;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.AgendaManager;

public class FrenchAddressCreator {

    public static AgendaEntry createAddress(String personeName,
                                            String streetName,
                                            int streetNumber,
                                            String additionalInformation,
                                            String department,
                                            String zipCode,
                                            String city) {
        FrenchAddress newAddress = (FrenchAddress) AgendaManager.MY_ADDRESS_FACTORY.getAgendaEntry(Agenda.Country.FRANCE);
        newAddress.setPersoneName(personeName);
        newAddress.setStreetName(streetName);
        newAddress.setAdditionalInformation(additionalInformation);
        newAddress.setDepartment(department);
        newAddress.setZipCode(zipCode);
        newAddress.setCity(city);
        return newAddress;
    }
}
