package Agenda.EntriesFactory.Adresses;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.AgendaManager;

public class SpanishAddressCreator {
    public static AgendaEntry createAddress(String personeName,
                                            String streetType,
                                            String streetName,
                                            int streetNumber,
                                            String floor,
                                            int door,
                                            String additionalInfo,
                                            String zipCode,
                                            String city,
                                            String province) {
        SpanishAddress newAddress = (SpanishAddress) AgendaManager.MY_ADDRESS_FACTORY.getAgendaEntry(Agenda.Country.SPAIN);
        newAddress.setPersoneName(personeName);
        newAddress.setStreetType(streetType);
        newAddress.setStreetName(streetName);
        newAddress.setStreetNumber(streetNumber);
        newAddress.setFloor(floor);
        newAddress.setDoor(door);
        newAddress.setAdditionalInfo(additionalInfo);
        newAddress.setZipCode(zipCode);
        newAddress.setCity(city);
        newAddress.setProvince(province);
        return newAddress;
    }
}
