class TestMahasiswa
{
	public static void main(String[] args) 
	{
		Mahasiswa mhs = new Mahasiswa("Hasan Fikri", 19);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(19);
		mhs.tampilkanBiodata();		
	}	
}