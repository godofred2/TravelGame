package read;

import model.EdgeAux;
import model.Vertex;

import java.util.ArrayList;

public class ToJsonReader {

    public static ArrayList<Vertex<String>> readV() {
        ArrayList<Vertex<String>> vertexArrayList = new ArrayList<>();

        vertexArrayList.add(new Vertex<>("Cali - NovaSphere Depot", 0));
        vertexArrayList.add(new Vertex<>("Medellín - CelestialRide Terminal", 1));
        vertexArrayList.add(new Vertex<>("Popayan- QuantumGlide Hub", 2));
        vertexArrayList.add(new Vertex<>("Barranquilla - StellarLine Exchange", 3));
        vertexArrayList.add(new Vertex<>("Cartagena - AeroMagnet Central", 4));
        vertexArrayList.add(new Vertex<>("Cúcuta - AeroFusion Nexus", 5));
        vertexArrayList.add(new Vertex<>("Bucaramanga - HyperLoop Nexus", 6));
        vertexArrayList.add(new Vertex<>("Pereira - WarpVista Terminal", 7));
        vertexArrayList.add(new Vertex<>("Santa Marta - QuantumFlare Terminal", 8));
        vertexArrayList.add(new Vertex<>("Ibagué - QuantumLeap Terminal", 9));
        vertexArrayList.add(new Vertex<>("Pasto - SynthRail Station", 10));
        vertexArrayList.add(new Vertex<>("Manizales - SynthPulse Junction", 11));
        vertexArrayList.add(new Vertex<>("Neiva - ZeroGravity Depot", 12));
        vertexArrayList.add(new Vertex<>("Ciénaga - FusionFlow Station", 13));
        vertexArrayList.add(new Vertex<>("Soledad - AeroVortex Nexus", 14));
        vertexArrayList.add(new Vertex<>("Villavicencio - NovaLink Depot", 15));
        vertexArrayList.add(new Vertex<>("Valledupar - SolarSphere Terminal", 16));
        vertexArrayList.add(new Vertex<>("Montería - SynthWave Nexus", 17));
        vertexArrayList.add(new Vertex<>("Sincelejo - AeroPulse Junction", 18));
        vertexArrayList.add(new Vertex<>("Popayán - QuantumQuasar Station", 19));
        vertexArrayList.add(new Vertex<>("Bello - Infinity Transit Hub", 20));
        vertexArrayList.add(new Vertex<>("Armenia - CelestiaLink Center", 21));
        vertexArrayList.add(new Vertex<>("Tunja - AstroSynth Hub", 22));
        vertexArrayList.add(new Vertex<>("Florencia - StellarSprint Exchange", 23));
        vertexArrayList.add(new Vertex<>("Girardot - EtherRail Station", 24));
        vertexArrayList.add(new Vertex<>("Sogamoso - AeroSynth Hub", 25));
        vertexArrayList.add(new Vertex<>("Tuluá - PhotonRide Nexus", 26));
        vertexArrayList.add(new Vertex<>("Buenaventura - TechVista Terminal", 27));
        vertexArrayList.add(new Vertex<>("Magangué - NebulaTransit Center", 28));
        vertexArrayList.add(new Vertex<>("Zipaquirá - AeroMag Hub", 29));
        vertexArrayList.add(new Vertex<>("Quibdó - SkyBlaze Station", 30));
        vertexArrayList.add(new Vertex<>("Riohacha - Vortex Gateway", 31));
        vertexArrayList.add(new Vertex<>("Arauca - WarpWave Terminal", 32));
        vertexArrayList.add(new Vertex<>("Turbo - Celestial Transit Hub", 33));
        vertexArrayList.add(new Vertex<>("Girón - SynthWave Nexus", 34));
        vertexArrayList.add(new Vertex<>("Ipiales - AeroPulse Junction", 35));
        vertexArrayList.add(new Vertex<>("Mocoa - QuantumSprint Station", 36));
        vertexArrayList.add(new Vertex<>("Ocaña - HyperNova Nexus", 37));
        vertexArrayList.add(new Vertex<>("Maicao - NovaSphere Depot", 38));
        vertexArrayList.add(new Vertex<>("Yopal - QuantumFlare Terminal", 39));
        vertexArrayList.add(new Vertex<>("Tumaco - PulseJet Exchange", 40));
        vertexArrayList.add(new Vertex<>("Palmira - AeroVortex Nexus", 41));
        vertexArrayList.add(new Vertex<>("Rionegro - SynthGlide Hub", 42));
        vertexArrayList.add(new Vertex<>("Tame - OmniRail Depot", 43));
        vertexArrayList.add(new Vertex<>("Chiquinquirá - WarpWave Terminal", 44));
        vertexArrayList.add(new Vertex<>("Barrancabermeja - StellarPulse Nexus", 45));
        vertexArrayList.add(new Vertex<>("Leticia - SolarSphere Terminal", 46));
        vertexArrayList.add(new Vertex<>("Garzón - AeroSynth Hub", 47));
        vertexArrayList.add(new Vertex<>("Calarcá - QuantumLeap Terminal", 48));
        vertexArrayList.add(new Vertex<>("La Dorada - HyperLoop Nexus", 49));


        return vertexArrayList;
    }

    public static ArrayList<EdgeAux> readA() {
        ArrayList<EdgeAux> edgeArrayList = new ArrayList<>();

        // Agrega manualmente las aristas que desees
        edgeArrayList.add(new EdgeAux(0, 1, 3));
        edgeArrayList.add(new EdgeAux(0, 2, 6));
        edgeArrayList.add(new EdgeAux(0, 3, 2));
        edgeArrayList.add(new EdgeAux(1, 4, 3));
        edgeArrayList.add(new EdgeAux(2, 5, 5));
        edgeArrayList.add(new EdgeAux(2, 6, 1));
        edgeArrayList.add(new EdgeAux(3, 7, 7));
        edgeArrayList.add(new EdgeAux(4, 8, 2));
        edgeArrayList.add(new EdgeAux(5, 10, 4));
        edgeArrayList.add(new EdgeAux(6, 10, 3));
        edgeArrayList.add(new EdgeAux(7, 9, 8));
        edgeArrayList.add(new EdgeAux(8, 10, 3));
        edgeArrayList.add(new EdgeAux(9, 10, 10));
        edgeArrayList.add(new EdgeAux(10, 11, 1));
        edgeArrayList.add(new EdgeAux(10, 12, 3));
        edgeArrayList.add(new EdgeAux(10, 13, 1));
        edgeArrayList.add(new EdgeAux(12, 14, 11));
        edgeArrayList.add(new EdgeAux(12, 15, 14));
        edgeArrayList.add(new EdgeAux(12, 16, 15));
        edgeArrayList.add(new EdgeAux(14, 17, 10));
        edgeArrayList.add(new EdgeAux(15, 18, 18));
        edgeArrayList.add(new EdgeAux(15, 19, 15));
        edgeArrayList.add(new EdgeAux(16, 19, 8));
        edgeArrayList.add(new EdgeAux(16, 20, 4));
        edgeArrayList.add(new EdgeAux(17, 22, 19));
        edgeArrayList.add(new EdgeAux(18, 23, 20));
        edgeArrayList.add(new EdgeAux(18, 24, 12));
        edgeArrayList.add(new EdgeAux(18, 19, 2));
        edgeArrayList.add(new EdgeAux(19, 25, 10));
        edgeArrayList.add(new EdgeAux(19, 26, 18));
        edgeArrayList.add(new EdgeAux(20, 27, 13));
        edgeArrayList.add(new EdgeAux(22, 21, 6));
        edgeArrayList.add(new EdgeAux(22, 28, 22));
        edgeArrayList.add(new EdgeAux(23, 28, 30));
        edgeArrayList.add(new EdgeAux(23, 29, 23));
        edgeArrayList.add(new EdgeAux(24, 29, 27));
        edgeArrayList.add(new EdgeAux(25, 30, 11));
        edgeArrayList.add(new EdgeAux(25, 26, 21));
        edgeArrayList.add(new EdgeAux(26, 31, 10));
        edgeArrayList.add(new EdgeAux(26, 27, 5));
        edgeArrayList.add(new EdgeAux(27, 31, 3));
        edgeArrayList.add(new EdgeAux(28, 29, 34));
        edgeArrayList.add(new EdgeAux(29, 32, 25));
        edgeArrayList.add(new EdgeAux(29, 33, 21));
        edgeArrayList.add(new EdgeAux(29, 34, 14));
        edgeArrayList.add(new EdgeAux(30, 31, 1));
        edgeArrayList.add(new EdgeAux(32, 35, 7));
        edgeArrayList.add(new EdgeAux(33, 35, 21));
        edgeArrayList.add(new EdgeAux(34, 36, 43));
        edgeArrayList.add(new EdgeAux(35, 37, 37));
        edgeArrayList.add(new EdgeAux(35, 38, 10));
        edgeArrayList.add(new EdgeAux(37, 39, 42));
        edgeArrayList.add(new EdgeAux(37, 40, 37));
        edgeArrayList.add(new EdgeAux(38, 41, 29));
        edgeArrayList.add(new EdgeAux(38, 42, 39));
        edgeArrayList.add(new EdgeAux(39, 43, 23));
        edgeArrayList.add(new EdgeAux(40, 44, 45));
        edgeArrayList.add(new EdgeAux(41, 45, 26));
        edgeArrayList.add(new EdgeAux(42, 46, 31));
        edgeArrayList.add(new EdgeAux(43, 47, 16));
        edgeArrayList.add(new EdgeAux(44, 48, 39));
        edgeArrayList.add(new EdgeAux(45, 48, 46));
        edgeArrayList.add(new EdgeAux(46, 49, 40));
        edgeArrayList.add(new EdgeAux(47, 48, 36));

        return edgeArrayList;
    }
}