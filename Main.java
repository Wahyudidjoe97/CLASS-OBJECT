package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------Object Kelas Kotak-----------");
        //Buat object dari kelas kotak
        Kotak main = new Kotak();
        //mengatur ukuran kotak
        main.setPanjang(12.33);
        main.setLebar(5.34);

        //memanggil object kotak
        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------Object Kelas Mahasiswa---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama = "Wahyudi";
        Mahasiswa.nim = "D0217351";
        Mahasiswa.alamat = "Polewali";
        Mahasiswa.golonganDarah = "O";
        Mahasiswa.status = "Mahasiswa";
        Mahasiswa.tinggiBadan = "175";
        Mahasiswa.beratBadan = "54";

        //getter mahasiswa
        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------object Kelas node---------------");
        //membuat object dari kelas note
        node node = new node();
        node.Label = "Aqua";
        node.Value = 3;

        //getter node
        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------object class stack-------------");
        //membuat object kelas stack
        stack stack = new stack();

        stack.value[0] = "Wahyudi";
        stack.value[1] = "hidan";
        stack.value[2] = "sasuke";
        stack.value[3] = "juju";
        stack.value[4] = "sudar";
        stack.value[5] = "mimin";
        stack.setValueAt(6, "juju");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }

    }