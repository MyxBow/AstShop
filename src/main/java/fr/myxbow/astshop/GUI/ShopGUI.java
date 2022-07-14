package fr.myxbow.astshop.GUI;

import fr.myxbow.astshop.AstShop;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShopGUI implements Listener {

    Economy eco = AstShop.getEconomy();

    public Inventory HubShop() {
        Inventory gui = Bukkit.createInventory(null, 27, "§3>> §2Magasin §3<<");

        ItemStack mob = new ItemStack(Material.VILLAGER_SPAWN_EGG);
        ItemMeta mobMeta = mob.getItemMeta();
        mobMeta.setDisplayName("§aCréatures");
        mob.setItemMeta(mobMeta);

        gui.setItem(22, mob);

        ItemStack seed = new ItemStack(Material.WHEAT_SEEDS);
        ItemMeta seedMeta = seed.getItemMeta();
        seedMeta.setDisplayName("§bAgriculture");
        seed.setItemMeta(seedMeta);

        gui.setItem(3, seed);

        return gui;
    }

    public Inventory MobShop() {
        Inventory gui = Bukkit.createInventory(null, 27, "§3>> §2Créatures §3<<");

        int vache_prix = 5;
        int moutons_prix = 5;
        int cochon_prix = 5;
        int poule_prix = 5;
        int villager_prix = 5;
        int zombie_prix = 10;
        int skellette_prix = 10;

        ItemStack vache = new ItemStack(Material.COW_SPAWN_EGG);
        ItemMeta vacheMeta = vache.getItemMeta();
        vacheMeta.setDisplayName("§aVache");
        List<String> vacheLore = new ArrayList<String>();
        vacheLore.add("§7Prix: §f"+vache_prix);
        vacheMeta.setLore(vacheLore);
        vache.setItemMeta(vacheMeta);
        gui.setItem(1, vache);

        ItemStack mouton = new ItemStack(Material.SHEEP_SPAWN_EGG);
        ItemMeta moutonMeta = mouton.getItemMeta();
        moutonMeta.setDisplayName("§aMouton");
        List<String> moutonLore = new ArrayList<String>();
        moutonLore.add("§7Prix: §f"+moutons_prix);
        moutonMeta.setLore(moutonLore);
        mouton.setItemMeta(moutonMeta);
        gui.setItem(3, mouton);

        ItemStack cochon = new ItemStack(Material.PIG_SPAWN_EGG);
        ItemMeta cochonMeta = cochon.getItemMeta();
        cochonMeta.setDisplayName("§aCochon");
        List<String> cochonLore = new ArrayList<String>();
        cochonLore.add("§7Prix: §f"+cochon_prix);
        cochonMeta.setLore(cochonLore);
        cochon.setItemMeta(cochonMeta);
        gui.setItem(5, cochon);

        ItemStack poule = new ItemStack(Material.CHICKEN_SPAWN_EGG);
        ItemMeta pouleMeta = poule.getItemMeta();
        pouleMeta.setDisplayName("§aPoule");
        List<String> pouleLore = new ArrayList<String>();
        pouleLore.add("§7Prix: §f"+poule_prix);
        pouleMeta.setLore(pouleLore);
        poule.setItemMeta(pouleMeta);
        gui.setItem(7, poule);

        ItemStack vil = new ItemStack(Material.VILLAGER_SPAWN_EGG);
        ItemMeta vilMeta = vil.getItemMeta();
        vilMeta.setDisplayName("§aVillageois");
        List<String> vilLore = new ArrayList<String>();
        vilLore.add("§7Prix: §f"+villager_prix);
        vilMeta.setLore(vilLore);
        vil.setItemMeta(vilMeta);
        gui.setItem(10, vil);

        ItemStack zom = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        ItemMeta zomMeta = zom.getItemMeta();
        zomMeta.setDisplayName("§aZombie");
        List<String> zomLore = new ArrayList<String>();
        zomLore.add("§7Prix: §f"+zombie_prix);
        zomMeta.setLore(zomLore);
        zom.setItemMeta(zomMeta);
        gui.setItem(12, zom);

        ItemStack skel = new ItemStack(Material.SKELETON_SPAWN_EGG);
        ItemMeta skelMeta = skel.getItemMeta();
        skelMeta.setDisplayName("§aSquelette");
        List<String> skelLore = new ArrayList<String>();
        skelLore.add("§7Prix: §f"+skellette_prix);
        skelMeta.setLore(skelLore);
        skel.setItemMeta(skelMeta);
        gui.setItem(14, skel);

        return gui;
    }

    public Inventory SeedShop() {
        Inventory gui = Bukkit.createInventory(null, 27, "§3>> §bAgriculture §3<<");

        String seed_sell = "0.50";
        String seed_buy = "1.50";

        ItemStack wheat = new ItemStack(Material.WHEAT_SEEDS);
        ItemMeta wheat_meta = wheat.getItemMeta();
        wheat_meta.setDisplayName("§bBlé");
        List<String> wheat_lore = new ArrayList<String>();
        wheat_lore.add("§7Vendre (clique droit): §f"+seed_sell);
        wheat_lore.add("§7Acheter (clique gauche): §f"+seed_buy);
        wheat_meta.setLore(wheat_lore);
        wheat.setItemMeta(wheat_meta);

        gui.setItem(1, wheat);

        ItemStack carrot = new ItemStack(Material.CARROT);
        ItemMeta carrot_meta = carrot.getItemMeta();
        carrot_meta.setDisplayName("§bCarotte");
        List<String> carrot_lore = new ArrayList<String>();
        carrot_lore.add("§7Vendre (clique droit): §f"+seed_sell);
        carrot_lore.add("§7Acheter (clique gauche): §f"+seed_buy);
        carrot_meta.setLore(carrot_lore);
        carrot.setItemMeta(carrot_meta);

        gui.setItem(3, carrot);

        ItemStack patate = new ItemStack(Material.POTATO);
        ItemMeta patate_meta = patate.getItemMeta();
        patate_meta.setDisplayName("§bPatate");
        List<String> patate_lore = new ArrayList<String>();
        patate_lore.add("§7Vendre (clique droit): §f"+seed_sell);
        patate_lore.add("§7Acheter (clique gauche): §f"+seed_buy);
        patate_meta.setLore(patate_lore);
        patate.setItemMeta(patate_meta);

        gui.setItem(5, patate);

        ItemStack melon = new ItemStack(Material.MELON_SEEDS);
        ItemMeta melon_meta = melon.getItemMeta();
        melon_meta.setDisplayName("§bMelon");
        List<String> melon_lore = new ArrayList<String>();
        melon_lore.add("§7Vendre (clique droit): §f"+seed_sell);
        melon_lore.add("§7Acheter (clique gauche): §f"+seed_buy);
        melon_meta.setLore(melon_lore);
        melon.setItemMeta(melon_meta);

        gui.setItem(7, melon);

        ItemStack citrouille = new ItemStack(Material.MELON_SLICE);
        ItemMeta citrouille_meta = citrouille.getItemMeta();
        melon_meta.setDisplayName("§bTranche de melon");
        List<String> citrouille_lore = new ArrayList<String>();
        citrouille_lore.add("§7Vendre (clique droit): §f"+seed_sell);
        citrouille_lore.add("§7Acheter (clique gauche): §f"+seed_buy);
        citrouille_meta.setLore(citrouille_lore);
        citrouille.setItemMeta(citrouille_meta);

        gui.setItem(10, citrouille);

        return gui;
    }









//------------------------------------------------------------------------EVENT------------------------------------------------------------------------------------
    @EventHandler
    public void OnClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();

        if(e.getCurrentItem() == null) return;

        if (e.getView().getTitle().equals("§3>> §2Magasin §3<<")){

            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.VILLAGER_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aCréatures")) {
                player.closeInventory();
                player.openInventory(MobShop());
            }

            if (e.getCurrentItem().getType() == Material.WHEAT_SEEDS &&
            ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bAgriculture")) {
                player.closeInventory();
                player.openInventory(SeedShop());
            }
        }

        if (e.getView().getTitle().equals("§3>> §2Créatures §3<<")){

            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.COW_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aVache")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.COW_SPAWN_EGG);

                    eco.withdrawPlayer(player, 5);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.SHEEP_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aMouton")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.SHEEP_SPAWN_EGG);

                    eco.withdrawPlayer(player, 5);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.PIG_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aCochon")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.PIG_SPAWN_EGG);

                    eco.withdrawPlayer(player, 5);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.CHICKEN_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aPoule")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.CHICKEN_SPAWN_EGG);

                    eco.withdrawPlayer(player, 5);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.VILLAGER_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aVillageois")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.VILLAGER_SPAWN_EGG);

                    eco.withdrawPlayer(player, 5);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.ZOMBIE_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aZombie")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.ZOMBIE_SPAWN_EGG);

                    eco.withdrawPlayer(player, 10);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

            if (e.getCurrentItem().getType() == Material.ZOMBIE_SPAWN_EGG &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§aSquelette")) {
                if (eco.getBalance(player) >= 5){
                    ItemStack item = new ItemStack(Material.ZOMBIE_SPAWN_EGG);

                    eco.withdrawPlayer(player, 10);
                    player.getInventory().addItem(item);
                    player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                } else {

                    player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                }
            }

        }

        if (e.getView().getTitle().equals("§3>> §bAgriculture §3<<")){

            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.WHEAT_SEEDS &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bBlé")) {

                if (e.getClick().isRightClick()){

                    if (player.getInventory().contains(Material.WHEAT_SEEDS)){

                        player.getInventory().removeItem(new ItemStack(Material.WHEAT_SEEDS, 1));
                        eco.depositPlayer(player, 0.50);
                        player.sendActionBar("§b>> §aVente effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas l'item requis !");

                    }

                }

                if (e.getClick().isLeftClick()){

                    if (eco.getBalance(player) >= 1.50){

                        player.getInventory().addItem(new ItemStack(Material.WHEAT_SEEDS, 1));
                        player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                    }

                }

            }

            if (e.getCurrentItem().getType() == Material.CARROT &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bCarotte")) {

                ItemStack item = new ItemStack(Material.CARROT, 1);

                if (e.getClick().isRightClick()) {

                    if (player.getInventory().contains(Material.CARROT)) {

                        player.getInventory().removeItem(new ItemStack(Material.CARROT, 1));
                        eco.depositPlayer(player, 0.50);
                        player.sendActionBar("§b>> §aVente effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas l'item requis !");

                    }

                }

                if (e.getClick().isLeftClick()) {

                    if (eco.getBalance(player) >= 1.50) {

                        player.getInventory().addItem(new ItemStack(Material.CARROT, 1));
                        player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                    }

                }
            }

            if (e.getCurrentItem().getType() == Material.POTATO &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bPatate")) {

                ItemStack item = new ItemStack(Material.POTATO, 1);

                if (e.getClick().isRightClick()) {

                    if (player.getInventory().contains(Material.POTATO)) {

                        player.getInventory().removeItem(new ItemStack(Material.POTATO, 1));
                        eco.depositPlayer(player, 0.50);
                        player.sendActionBar("§b>> §aVente effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas l'item requis !");

                    }

                }

                if (e.getClick().isLeftClick()) {

                    if (eco.getBalance(player) >= 1.50) {

                        player.getInventory().addItem(new ItemStack(Material.POTATO, 1));
                        player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                    }

                }
            }

            if (e.getCurrentItem().getType() == Material.MELON_SEEDS &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bMelon")) {

                ItemStack item = new ItemStack(Material.MELON_SEEDS, 1);

                if (e.getClick().isRightClick()) {

                    if (player.getInventory().contains(Material.MELON_SEEDS)) {

                        player.getInventory().removeItem(new ItemStack(Material.MELON_SEEDS, 1));
                        eco.depositPlayer(player, 0.50);
                        player.sendActionBar("§b>> §aVente effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas l'item requis !");

                    }

                }

                if (e.getClick().isLeftClick()) {

                    if (eco.getBalance(player) >= 1.50) {

                        player.getInventory().addItem(new ItemStack(Material.MELON_SEEDS, 1));
                        player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                    }

                }
            }

            if (e.getCurrentItem().getType() == Material.MELON_SLICE &&
                    ((ItemMeta) Objects.requireNonNull(e.getCurrentItem().getItemMeta())).getDisplayName().equals("§bTranche de melon")) {

                ItemStack item = new ItemStack(Material.PUMPKIN, 1);

                if (e.getClick().isRightClick()) {

                    if (player.getInventory().contains(Material.MELON_SLICE)) {

                        player.getInventory().removeItem(new ItemStack(Material.MELON_SLICE, 1));
                        eco.depositPlayer(player, 0.50);
                        player.sendActionBar("§b>> §aVente effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas l'item requis !");

                    }

                }

                if (e.getClick().isLeftClick()) {

                    if (eco.getBalance(player) >= 1.50) {

                        player.getInventory().addItem(new ItemStack(Material.MELON_SLICE, 1));
                        player.sendActionBar("§b>> §aAchat effectué ! §b<<");

                    } else {

                        player.closeInventory();
                        player.sendMessage("§7§l>> §cVous n'avez pas assez d'argent !");

                    }

                }
            }


        }

    }

}
