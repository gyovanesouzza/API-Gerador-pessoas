package com.gyovane.api_gerador_pessoas.beans.utils;


import java.io.File;
import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;;

public class Dados {

    static String FILEPATH = "C:\\Users\\gyova\\Documents\\Projetos\\API Gerador pessoas\\src\\main\\resources\\static\\dados.xlsx";
    private final List<String> SOBRENOMES = Arrays.asList(
            "Agostinho", "Aguiar", "Albuquerque", "Alegria", "Alencastro", "Almada", "Almeida", "Alves", "Alves",
            "Alvim", "Amorim", "Andrade", "Antunes", "Aparício", "Apolinário", "Aragão", "Araújo", "Araújo", "Arruda",
            "Assis", "Assunção", "Ávila", "Azambuja", "Baptista", "Barbosa", "Barreto", "Barros", "Barros",
            "Beira-Mar", "Belchior", "Belém", "Bernardes", "Bittencourt", "Boaventura", "Bonfim", "Botelho", "Brites", "Brito",
            "Caetano", "Caldeira", "Calixto", "Camacho", "Camilo", "Campos", "Capelo", "Cardoso", "Cardoso", "Carvalho", "Carvalho", "Castro",
            "Castro", "Cavalcante", "Cavalcanti", "Chaves", "Conceição", "Córdoba", "Corte Real", "Cortês", "Costa", "Coutinho", "Crespo", "Cunha",
            "Curado", "Custódio", "D’Ávila", "da Conceição", "da Costa", "da Cruz", "da Cunha", "da Luz", "da Mata", "da Mota", "da Paz",
            "da Rocha", "da Rosa", "Damásio", "Dantas", "das Neves", "Dias", "Dias", "Dinís", "Domingues", "Dorneles", "dos Reis", "Drumond", "Duarte",
            "Escobar", "Espinosa", "Esteves", "Evangelista", "Farias", "Farias", "Félix", "Fernandes", "Fernandes", "Ferrari",
            "Ferreira", "Figueiredo", "Figueiroa", "Flores", "Fogaça", "Fogaça", "Freitas", "Freitas", "Frutuoso", "Furtado",
            "Galvão", "Garcia", "Gaspar", "Gentil", "Geraldes", "Gil", "Godinho", "Góis", "Gomes", "Gomes", "Gomes", "Gonçalves",
            "Gonzaga", "Goulart", "Gouveia", "Guedes", "Guimarães", "Guterres", "Hernandes", "Hilário", "Hipólito",
            "Ibrahim", "Ilha", "Infante", "Jaques", "Jesus", "Jesus", "Jordão", "Lacerda", "Lancastre", "Leiria", "Lessa",
            "Lima", "Lopes", "Machado", "Maciel", "Magalhães", "Maia", "Maldonado", "Marinho", "Marques", "Martins", "Martins", "Martins",
            "Medeiros", "Meireles", "Mello", "Melo", "Mendes", "Mendes", "Mendes", "Menezes", "Mesquita", "Modesto", "Monteiro", "Monteiro",
            "Moraes", "Morais", "Moreira", "Moreira", "Morgado", "Moura", "Moura", "Muniz", "Nascimento", "Neves", "Nóbrega", "Nogueira", "Nogueira",
            "Novaes", "Novais", "Nunes", "Oliveira", "Oliveira", "Ornélas", "Ourique", "Pacheco", "Padilha", "Paiva", "Paraíso", "Paris", "Peixoto",
            "Peixoto", "Peralta", "Pereira", "Pereira", "Peres", "Pilar", "Pimenta", "Pinheiro", "Pinto", "Pires", "Portela", "Porto",
            "Quaresma", "Quarteira", "Queiroz", "Ramires", "Ramos", "Ramos", "Rebelo", "Resende", "Rezende", "Ribeiro",
            "Ribeiro", "Ribeiro", "Rocha", "Rodrigues", "Rodrigues", "Salazar", "Sales", "Sales", "Salgado", "Salgueiro", "Sampaio", "Sanches",
            "Santana", "Santos", "Silva", "Silveira", "Siqueira", "Soares", "Souza", "Subtil", "Tavares", "Taveira", "Teixeira",
            "Teixeira", "Teles", "Torres", "Trindade", "Varela", "Vargas", "Vasconcelos", "Vasques", "Veiga", "Veloso",
            "Viana", "Vidal", "Vieira", "Vieira", "Vilela", "Xavier", "Ximenes", "Xisco", "Zagalo", "Zaganelli", "Zanette"
    );

    private final List<String> PROVEDORES_EMAIL = Arrays.asList(
            "0-mail.com", "007addict.com", "020.co.uk", "027168.com",
            "0815.ru", "0815.su", "0clickemail.com", "0sg.net", "0wnd.net", "0wnd.org",
            "1033edge.com", "10mail.org", "10minutemail.co.za", "10minutemail.com", "11mail.com",
            "123-m.com", "123.com", "123box.net", "123india.com", "123mail.cl", "123mail.org", "123qwe.co.uk",
            "126.com", "126.net", "138mail.com", "139.com", "150mail.com", "150ml.com",
            "15meg4free.com", "163.com", "16mail.com", "188.com", "189.cn", "1auto.com",
            "1ce.us", "1chuan.com", "1colony.com", "1coolplace.com", "1email.eu", "1freeemail.com", "1fsdfdsfsdf.tk",
            "1funplace.com", "1internetdrive.com", "1mail.ml", "1mail.net", "1me.net", "1mum.com",
            "1musicrow.com", "1netdrive.com", "1nsyncfan.com", "1pad.de", "1under.com", "1webave.com",
            "1webhighway.com", "1zhuan.com", "2-mail.com", "20email.eu", "20mail.in", "20mail.it",
            "20minutemail.com", "212.com", "21cn.com", "247emails.com", "24horas.com", "2911.net",
            "2980.com", "2bmail.co.uk", "2coolforyou.net", "2d2i.com", "2die4.com",
            "2fdgdfgdfgdf.tk", "2hotforyou.net", "2mydns.com", "2net.us", "2prong.com", "2trom.com", "3000.it",
            "30minutemail.com", "30minutesmail.com", "3126.com", "321media.com", "33mail.com", "360.ru", "37.com",
            "3ammagazine.com", "3dmail.com", "3email.com", "3g.ua", "3mail.ga", "3trtretgfrfe.tk",
            "3xl.net", "444.net", "4email.com", "4email.net", "4gfdsgfdgfd.tk", "4mg.com",
            "4newyork.com", "4warding.com", "4warding.net", "4warding.org", "4x4fan.com", "4x4man.com", "50mail.com"
    );

    private HashMap<String, List<String>> leituraNome() {
        HashMap<String, List<String>> nomes = new HashMap<>();

        try {
            FileInputStream file = new FileInputStream(new File(FILEPATH));

            XSSFWorkbook wb = new XSSFWorkbook(file);


            List<String> masculino = new ArrayList<>();
            List<String> feminino = new ArrayList<>();

            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
                XSSFRow row = (XSSFRow) rowIterator.next();


                Iterator cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    XSSFCell cell = (XSSFCell) cellIterator.next();
                    if (cell.getStringCellValue().equals("Femininos")) {
                        cell = (XSSFCell) cellIterator.next();
                        feminino.add(cell.getStringCellValue());
                    } else if (cell.getStringCellValue().equals("Masculinos")) {
                        cell = (XSSFCell) cellIterator.next();
                        masculino.add(cell.getStringCellValue());

                    }


                }
            }


            nomes.put("masculino", masculino);
            nomes.put("feminino", feminino);

        } catch (Exception exception) {

            System.out.println(exception.getMessage());

        }

        return nomes;
    }

    public List<String> nomes(String sexo) {
        if (sexo.equals("M") || sexo.equals("Homen") || sexo.equals("F") || sexo.equals("Mulher")) {
            if( sexo.equals("M") || sexo.equals("Homen")){
                sexo = "masculino" ;
            }else{
                sexo = "feminino" ;
            }
            return leituraNome().get(sexo);

        }
        return null;

    }

    public String getSOBRENOMES(int index) {
        return SOBRENOMES.get(index);
    }
    public List<String> getSOBRENOMES() {
        return SOBRENOMES;
    }

    public List<String> getPROVEDORES_EMAIL() {
        return PROVEDORES_EMAIL;
    }

    public List<String> getNome(String sexo) {
        if (sexo.equals("M") || sexo.equals("Homen") || sexo.equals("F") || sexo.equals("Mulher")) {
            if( sexo.equals("M") || sexo.equals("Homen")){
                sexo = "masculino" ;
            }else{
                sexo = "feminino" ;
            }
            return leituraNome().get(sexo);

        }
        return null;
    }
}