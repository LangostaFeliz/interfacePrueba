import Lugar.Infraestructura;
import Lugar.Objeto;
import Lugar.Posicion;
import sun.plugin.viewer.IExplorerPluginObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

public class Interfaz extends JFrame{
    private JPanel Contenedor;
    private JButton GuardarBotton;
    private JButton AgregarBotton;
    private JButton LeerBotton;
    private JButton SalirBotton;
    private JPanel PanelImagen;
    private Random random= new Random();
    private Infraestructura infraestructura= new Infraestructura();

    public Interfaz()
   {
       add(Contenedor);
       setSize(1000,700);

       AgregarBotton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Objeto unObjeto = new Objeto(new Posicion((int) (Math.random()*1000),(int) (Math.random()*1000)), "Medicamento");
               infraestructura.getListaObjeto().add(unObjeto);
               System.out.println(unObjeto.toString());
               Image imagen=null;
               try{
                   imagen= ImageIO.read(new File("C:\\Users\\fhaos\\IdeaProjects\\interfacePrueba\\src\\medicamento.png"));
               }catch (IOException ex)
               {
                   ex.printStackTrace();
               }
               PanelImagen.getGraphics().clearRect(0,0,1000,500);
               for(Objeto objeto:infraestructura.getListaObjeto())
               {
                   PanelImagen.getGraphics().drawImage(imagen,objeto.getMyPosicion().getPosicionX(),objeto.getMyPosicion().getPosicionY(),50,50,null);
               }

               System.out.println("TOTAL objeto contiene :"+infraestructura.getListaObjeto().size());

           }
       });

       GuardarBotton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              JFileChooser fileChooser = new JFileChooser();
             fileChooser.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);
              if(fileChooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION)
              {
                  try{
                   //  FileOutputStream fileOutputStream= new FileOutputStream(File());
                   FileOutputStream fileOutputStream= new FileOutputStream("Objeto.dat");
                   BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                   ObjectOutputStream objectOutputStream= new ObjectOutputStream(bufferedOutputStream);

                   objectOutputStream.writeObject(infraestructura);
                   bufferedOutputStream.flush();

                   objectOutputStream.close();
                   bufferedOutputStream.close();
                   fileOutputStream.close();
                   System.out.println("Si guardo");
               }catch (FileNotFoundException ex){
                   ex.printStackTrace();
               }catch (IOException ex){
                   ex.printStackTrace();
               }
           }
              else {
                  System.out.println("No guardo");
              }

           }
       });
       LeerBotton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFileChooser fileChooser = new JFileChooser();
            //   if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                   try {
                    //   FileInputStream fileInputStream = new FileInputStream(fileChooser.getSelectedFile());
                      FileInputStream fileInputStream = new FileInputStream("lugar.dat");
                       ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                       infraestructura = (Infraestructura)objectInputStream.readObject();

                       objectInputStream.close();
                       fileInputStream.close();
                   } catch (FileNotFoundException ex) {
                       ex.printStackTrace();
                   } catch (IOException ex) {
                       ex.printStackTrace();
                   } catch (ClassNotFoundException ex) {
                       ex.printStackTrace();
                   }

                   Image imagen = null;
                   try {
                       imagen = ImageIO.read(new File("C:\\Users\\fhaos\\IdeaProjects\\interfacePrueba\\src\\medicamento.png"));
                   } catch (IOException ex) {
                       ex.printStackTrace();
                   }
                   Contenedor.getGraphics().clearRect(0,0, 1000, 500);
                   for(Objeto objeto:infraestructura.getListaObjeto())
                   {
                       PanelImagen.getGraphics().drawImage(imagen,objeto.getMyPosicion().getPosicionX(),objeto.getMyPosicion().getPosicionY(),50,50,null);
                   }

               };

       });
   }
}
