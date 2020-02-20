package skunk.utils;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.client.gui.Gui;

public class ParticleRender {
	
	private final List<Particle> particles;
	private int width, height, count;
	
	public ParticleUtil(final int width, final int height) {
		this.width = width;
		this.height = height;
		this.count = 80;
		this.particles = new ArrayList<Particle>();
		for (int count = 0; count <= this.count; ++count) {
			this.particles.add(new Random(new Particle().nextInt(height), new Random().nextInt(width)));
		}
		
	}
	public void drawParticle() {
			++this.xPos;
			++this.yPos;
			final int particleSize = 3;
			
			if (this.xPos > ParticleUtil.this.width) {
				this.xPos = -particleSize;
			}
			
			if(this.yPos > ParticleUtil.this.height) {
				this.yPos = -particleSize;
			}
			
			Gui.drawRect(this.xPos, this.yPos, this.xPos + particleSize,this.yPos + particleSize, Color.WHITE.getRGB());
	
	
	
	
	
		public void drawParticles() {
		this.particles.forEach(particle -> particle.drawParticle());
	
	
	public class Particle {
		
		private int xPos, yPos;
		
		public Particle(final int xPos, final int yPos) {
			this.xPos = xPos;
			this.yPos = yPos;
		}
		
		public void drawParticle() {
			++this.xPos;
			++this.yPos;
			final int particleSize = 3;
			
			if (this.xPos > ParticleUtil.this.width) {
				this.xPos = -particleSize;
			}
			
			if(this.yPos > ParticleUtil.this.height) {
				this.yPos = -particleSize;
			}
			
			Gui.drawRect(this.xPos, this.yPos, this.xPos + particleSize,this.yPos + particleSize, Color.WHITE.getRGB());
		}
	}
		
	}
		
