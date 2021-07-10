//Merhaba, ben Misc.
//�ncelikle beni destekledi�iniz i�in te�ekk�r ederim, istedi�imi ald�m.
//1k abone oldum ve k���k ama g�zel kitleli bir sunucum oldu.
//Bu source'yi umar�m bombo� �eyler yapmak yerine, kendinizi geli�tirmek i�in kullan�rs�n�z.
//Ben buna inanmay� tercih ediyorum.
//Hepinize te�ekk�r ederim, iyi oyunlar dilerim ;)

import java.text.SimpleDateFormat;

public class Module {

	public String moduleName;
	public int moduleKey;
	public boolean moduleState;

	public Module(String moduleName, int moduleKey) {
		this.moduleName = moduleName;
		this.moduleKey = moduleKey;
		this.moduleState = false;
	}

	public Module getModByName(String name) {
		for (Module mod : ModuleManager.getModules()) {
			if ((mod.moduleName.trim().equalsIgnoreCase(name.trim()))
					|| (mod.toString().trim().equalsIgnoreCase(name.trim()))) {
				return mod;
			}
		}
		return null;
	}

	public Module getInstance() {
		for (final Module mod : ModuleManager.getModules()) {
			if (mod.getClass().equals(this.getClass())) {
				return mod;
			}
		}
		return null;
	}

	public int getModuleKey() {
		return moduleKey;
	}

	public void setModuleKey(int newModuleKey) {
		moduleKey = newModuleKey;
	}

	public boolean getModuleState() {
		return this.moduleState;
	}

	public void setModuleState(boolean moduleState) {
		if (moduleState) {
			this.moduleState = true;
		} else {
			this.moduleState = false;
		}
	}

	public void onEnable() {
	}

	public void onDisable() {
	}

	public void onToggled() {
		if (this.moduleState) {
			try {
				onEnable();
			} catch (Exception e) {
			}
		} else {
			try {
				onDisable();
			} catch (Exception e) {
			}
		}
	}

	public String getModuleName() {
		return moduleName;
	}

	public void toggle() {
		this.setModuleState(!this.getModuleState());
		this.onToggled();
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "] " + "[Zortt LOG]: " + moduleName + (this.getModuleState() ? " toggle on." : " toggle off."));
	}
}
