package be.vdab.jpf.herhaling1.personen;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersoonManager {
    private Personen personen;

    private static final Path filePath = Paths.get("C:/temp/personen.dat");


    public void save(Personen personen) {
        try {
//            make an output filestream with the URI of the file
            var fileStream = new ObjectOutputStream(Files.newOutputStream( filePath ));

//            write the object on the filestream
            fileStream.writeObject(personen);

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        }

    public Personen load() {
        try {
            var fileStream = new ObjectInputStream(Files.newInputStream( filePath ));
            return (Personen) fileStream.readObject();
        } catch (Exception exception) {
        System.out.println("Uitzondering " + exception);
        }
        return null;
    }
}
