package Task5;

import java.util.*;

class WspolrzednaMapa{
    private int m, n;

    WspolrzednaMapa(int m, int n){
      this.m = m;
      this.n = n;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        WspolrzednaMapa other = (WspolrzednaMapa) obj;
        return m == other.m && n == other.n;
    }

    public int hashCode(){
        return Objects.hash(m, n);
    }

    public String toString(){
        return "Punkt " + m + n + " ma kolor";
    }
}


public class Task2 {
    public static void main(String[] args) {
        Map<WspolrzednaMapa, String> mapa = new TreeMap<>();

        mapa.put(new WspolrzednaMapa(2,3), new String("czerwony"));
        mapa.put(new WspolrzednaMapa(-3, 0), new String("czarny"));
        mapa.put(new WspolrzednaMapa(-1, 2), new String("czerwony"));
        mapa.put(new WspolrzednaMapa(2, -1), new String("czarny"));

        for (Map.Entry<WspolrzednaMapa, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
