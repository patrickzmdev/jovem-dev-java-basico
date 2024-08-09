package avaliacao.semana2;

import java.util.Random;

public class Personagem {

	String nome;
	int hp;
	int ataque;
	int defesa;

	public void batalhar(Personagem personagem) {

		int ataqueAtacante = personagem.getAtaque();
		int defesaAtacante = personagem.getDefesa();
		int hpHeroi = personagem.getHp();
		Morcego morcego = new Morcego();
		Zumbi zumbi = new Zumbi();
		Urso urso = new Urso();
		Vampiro vampiro = new Vampiro();
		Arok arok = new Arok();

		atacar(personagem, morcego, ataqueAtacante, defesaAtacante, hpHeroi);
		atacar(personagem, zumbi, ataqueAtacante, defesaAtacante, hpHeroi);
		atacar(personagem, urso, ataqueAtacante, defesaAtacante, hpHeroi);
		atacar(personagem, vampiro, ataqueAtacante, defesaAtacante, hpHeroi);
		atacar(personagem, arok, ataqueAtacante, defesaAtacante, hpHeroi);

	}

	public void atacar(Personagem heroi, Personagem inimigo, int ataqueAtacante, int defesaAtacante, int hpHeroi) {
		int ataque = ataqueAtacante;
		int defesa = defesaAtacante;
		int hpHeroiBatalha = hpHeroi;
		int defesaInimigo = inimigo.getDefesa();
		int ataqueInimigo = inimigo.getAtaque();
		int hpInimigo = inimigo.getHp();
		int turno = 0;

		boolean venceu = false;
		boolean perdeu = false;

		while (!venceu || !perdeu) {
			// Turno jogador
			turno += 1;
			Random random = new Random();
			int dado = random.nextInt(6);
			ataqueAtacante += dado;

			int restoDefesaInimigo = defesaInimigo - ataqueAtacante;
			if (restoDefesaInimigo < 0) {
				hpInimigo += restoDefesaInimigo;
			} else {
				hpInimigo -= restoDefesaInimigo;

			}

			if (hpInimigo <= 0) {
				System.out.println(heroi + " venceu inimigo " + inimigo.getNome() + " no turno " + turno);
				System.out.println();
				venceu = true;
				return;
			}

			// Turno Inimigo
			dado = random.nextInt(6);
			ataqueInimigo += dado;
			int restoDefesaHeroi = defesa - ataqueInimigo;
			if (restoDefesaHeroi < 0) {
				hpHeroiBatalha += restoDefesaHeroi;
			} else {
				hpHeroiBatalha -= restoDefesaHeroi;

			}

			if (hpHeroiBatalha <= 0) {
				System.out.println(inimigo.getNome() + " venceu " + heroi +" no turno " + turno);
				System.out.println();
				perdeu = true;
				return;
			}
		}
	}

	public Personagem(String nome, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public Personagem() {

	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return nome;
	}

}
