package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectionDb;


public class Internaute {
	private int idClient;
	private String email;
    private String nom;
    private String prenom;
    private String adresse;
    private String CodePostal;
    private String ville;
    private String tel;
    private String motPasse;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdClient() {
		return idClient;
	}

public void saveInternaute() throws Exception {
			ConnectionDb cdb = new ConnectionDb();
			try {
				String query = "INSERT INTO `clients` (`Email`, `Nom`, `Prenom`, `Adresse`, `CodePostal`, `Ville`, `Tel`, `MotPasse`) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";

				PreparedStatement ps = cdb.getConnexion().prepareStatement(query);
				ps.setString(1, this.getEmail());
				ps.setString(2, this.getNom());
				ps.setString(3, this.getPrenom());
				ps.setString(4, this.getAdresse());
				ps.setString(5, this.getCodePostal());
				ps.setString(6, this.getVille());
				ps.setString(7, this.getTel());
				ps.setString(8, this.getMotPasse());

				ps.executeUpdate();
			} catch (SQLException e) {
				throw new Exception("sql exception");
			} finally {
			cdb.close();
			}
		}

		public static Internaute getInternaute(String email, String mdp) {
			ConnectionDb conDB = new ConnectionDb();
			try {
				String query = "SELECT * FROM clients WHERE email = ? and MotPasse = ?";

				PreparedStatement ps = conDB.getConnexion().prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, mdp);
				ResultSet rs = ps.executeQuery();
				Internaute client = new Internaute();
				while (rs.next()) {
					client.setIdClient(rs.getInt("Id"));
					client.setNom(rs.getString("Nom"));
					client.setPrenom(rs.getString("Prenom"));
					client.setEmail(rs.getString("Email"));
					client.setMotPasse(rs.getString("MotPasse"));
					client.setAdresse(rs.getString("Adresse"));
					client.setVille(rs.getString("Ville"));
					client.setCodePostal(rs.getString("CodePostal"));
					client.setTel(rs.getString("Tel"));
					return client;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				conDB.close();
			}
			return null;
		}
	
}
