package othlon.hobbiton;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import othlon.hobbiton.proxie.CommonProxy;


@Mod(modid = "hobbiton", name = "HobbitOn", version = HobbitOn.VERSION)


public class HobbitOn {


        public static final String VERSION = "1.4.2";

        @Mod.Instance
        public static HobbitOn instance;

        public static CreativeTabs tabHobbit;

        // public static CommonHandler handler = new CommonHandler();

        @SidedProxy(clientSide = "othlon.hobbiton.proxie.ClientProxy", serverSide = "othlon.hobbiton.proxie.CommonProxy")
        public static CommonProxy proxy;


        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event) {

            //tabHobbit = new CPCreativeTab(CreativeTabs.getNextID(), "CherryPigTab");


            proxy.registerRenderers();




        }//end pre init

        @Mod.EventHandler
        public void init(FMLInitializationEvent event){

        }
}
