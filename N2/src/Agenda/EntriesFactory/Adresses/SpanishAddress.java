package Agenda.EntriesFactory.Adresses;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SpanishAddress implements Address {
    public enum StreetType {
        CALLE("Calle"), PLAZA("Plaza"), AVENIDA("Avenida"), BULEVAR("Bulevar"), PASAJE("Pasaje"), CALLEJON("Callejón");
        final private String name;

        StreetType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static StreetType findStreetTypeByName(String name) {
            return Arrays.stream(StreetType.values())
                    .filter(type -> type.name.equalsIgnoreCase(name))
                    .findFirst()
                    .orElse(null);
        }
    }

    public enum SpanishProvince {
        A_CORUNA(15, "A Coruña"),
        ALAVA(1, "Álava"),
        ALBACETE(2, "Albacete"),
        ALICANTE(3, "Alicante"),
        ALMERIA(4, "Almería"),
        ASTURIAS(33, "Asturias"),
        AVILA(5, "Ávila"),
        BADAJOZ(6, "Badajoz"),
        BARCELONA(8, "Barcelona"),
        BURGOS(9, "Burgos"),
        CACERES(10, "Cáceres"),
        CADIZ(11, "Cádiz"),
        CANTABRIA(39, "Cantabria"),
        CASTELLON(12, "Castellón"),
        CIUDAD_REAL(13, "Ciudad Real"),
        CORDOBA(14, "Córdoba"),
        CUENCA(16, "Cuenca"),
        GIRONA(17, "Girona"),
        GRANADA(18, "Granada"),
        GUADALAJARA(19, "Guadalajara"),
        GUIPUZCOA(20, "Guipúzcoa"),
        HUELVA(21, "Huelva"),
        HUESCA(22, "Huesca"),
        JAEN(23, "Jaén"),
        LA_RIOJA(26, "La Rioja"),
        LAS_PALMAS(35, "Las Palmas"),
        LEON(24, "León"),
        LLEIDA(25, "Lleida"),
        LUGO(27, "Lugo"),
        MADRID(28, "Madrid"),
        MALAGA(29, "Málaga"),
        MURCIA(30, "Murcia"),
        NAVARRA(31, "Navarra"),
        OURENSE(32, "Ourense"),
        PALENCIA(34, "Palencia"),
        PONTEVEDRA(36, "Pontevedra"),
        SALAMANCA(37, "Salamanca"),
        SANTA_CRUZ_DE_TENERIFE(38, "Santa Cruz de Tenerife"),
        SEGOVIA(40, "Segovia"),
        SEVILLA(41, "Sevilla"),
        SORIA(42, "Soria"),
        TARRAGONA(43, "Tarragona"),
        TERUEL(44, "Teruel"),
        TOLEDO(45, "Toledo"),
        VALENCIA(46, "Valencia"),
        VALLADOLID(47, "Valladolid"),
        VIZCAYA(48, "Vizcaya"),
        ZAMORA(49, "Zamora"),
        ZARAGOZA(50, "Zaragoza");

        private final int code;
        private final String name;

        SpanishProvince(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public static SpanishProvince findProvinceByName(String name) {
            return Arrays.stream(SpanishProvince.values())
                    .filter(province -> province.getName().equalsIgnoreCase(name))
                    .findFirst()
                    .orElse(null); // or throw an exception
        }

    }

    private String personeName;
    private StreetType streetType;
    private String streetName;
    private int streetNumber;
    private String floor;
    private int door;
    private String additionalInfo;
    private String zipCode;
    private String city;
    private SpanishProvince province;
    final private String country = "Spain";
    final private String countryAbr = "ES";

    public String getPersoneName() {
        return personeName;
    }

    public void setPersoneName(String personeName) {
        this.personeName = personeName;
    }

    public String getStreetType() {
        return streetType.getName();
    }

    public void setStreetType(String streetType) {
        StreetType type = StreetType.findStreetTypeByName(streetType);
        if (type != null) this.streetType = type;
        else {
            throw new InputMismatchException("Unknown street type");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() == 5) {
            this.zipCode = zipCode;
        } else {
            throw new InputMismatchException("Invalid French zipCode");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province.getName();
    }

    public void setProvince(String province) {
        SpanishProvince spanishProvince = SpanishProvince.findProvinceByName(province);
        if (spanishProvince != null) this.province = spanishProvince;
        else {
            throw new InputMismatchException("Unknown spanish provinc");
        }
    }

    @Override
    public String getCountry() {
        return country;
    }

    public String getCountryAbr() {
        return countryAbr;
    }

    @Override
    public void printAddress() {
        String message = """
                %s lives in the city of %s, in the province of %s, in %s at %d %s street.
                """.formatted(personeName, city, province.getName(), country, streetNumber, streetName);
        System.out.println(message);
    }
}
