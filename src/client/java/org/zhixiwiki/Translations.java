package org.zhixiwiki;

import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Translations {
    public static Map<String, Text> translations = Map.ofEntries(
            entry("Harvested souls from the Nether", Text.literal("从下界收割的灵魂")),
            entry("Energy source of the Dark Staff.", Text.literal("暗黑法杖的能量源泉。")),
            entry("Discovered by the Dark Mages", Text.literal("由暗黑法师所发现")),
            entry("This item is used to craft Dark Weapons.", Text.literal("这件道具用来制作暗黑武器。")),
            entry("Crystal Knight Polearm", Text.literal("水晶骑士长戟")),
            entry("Right-click to activate Water Breathing.", Text.literal("右键获得水下呼吸。")),
            entry("Corrupted ore by the repeated use of magic by dark mages.", Text.literal("被暗黑法师反复施放的魔法所腐化的矿石。")),
            entry("Obtained by mining Dark Ore.", Text.literal("挖掘暗黑矿石获得。")),
            entry("Dwarven Durability", Text.literal("矮人耐力")),
            entry("Right-click to activate Absorption.", Text.literal("右键获得伤害吸收。")),
            entry("Demon Slayer Katana", Text.literal("斩魔武士刀")),
            entry("Right-click to activate Regeneration.", Text.literal("右键获得再生。")),
            entry("Combines:", Text.literal("结合了：")),
            entry("-Dark Netherite Sword", Text.literal("-暗黑下界合金剑")),
            entry("-Dark Netherite Pickaxe", Text.literal("-暗黑下界合金镐")),
            entry("-Dark Netherite Axe", Text.literal("-暗黑下界合金斧")),
            entry("-Dark Netherite Shovel", Text.literal("-暗黑下界合金锹")),
            entry("-Dark Netherite Hoe", Text.literal("-暗黑下界合金锄")),
            entry("Reaper's Bane", Text.literal("收割灾星")),
            entry("Can also function as a hoe", Text.literal("可以作为锄使用")),
            entry("Right-click while sneaking to activate Haste.", Text.literal("潜行时右键获得急迫。")),
            entry("A Dark Cold Beverage.", Text.literal("一种暗黑冷饮。")),
            entry("Dark Mage Scepter", Text.literal("暗黑法师权杖")),
            entry("Uses Dark Souls as energy source", Text.literal("以暗黑灵魂作为能量源")),
            entry("Ember Cannon: Grants Absorption", Text.literal("余火加农炮：使用时获得")),
            entry("Health Boost and Regeneration when used.", Text.literal("伤害吸收，生命提升和再生。")),
            entry("Hunter's Bane", Text.literal("狩猎灾星")),
            entry("Uses Dark Pellets as ammo", Text.literal("使用暗黑弹丸为弹药")),
            entry("Gunsmith Protection: Grants Resistance", Text.literal("枪匠保护：使用时获得")),
            entry("and Regeneration when used", Text.literal("抗性提升和再生")),
            entry("Also causes temporary slowness.", Text.literal("同时造成短暂的缓慢。")),
            entry("Obtained after smelting Dark Netherite Swords.", Text.literal("熔炼暗黑下界合金剑获得。")),
            entry("Ammo used in Dark Rifles.", Text.literal("暗黑步枪使用的子弹。")),
            entry("Special core containing Dark Energy", Text.literal("容纳暗黑能量的特殊核心")),
            entry("Useful for crafting Dark Netherite Armor.", Text.literal("用于合成暗黑下界合金盔甲。")),
            entry("Rogue's Bane", Text.literal("盗贼灾星")),
            entry("Right-click to activate Speed.", Text.literal("右键获得速度。")),
            entry("Special Hammer", Text.literal("特殊锤子")),
            entry("Combine with other items in crafting table", Text.literal("与其他道具合成")),
            entry("Receive Dark Items", Text.literal("可获得暗黑道具")),
            entry("Hammer is retained but damaged in process.", Text.literal("锤子会保留，但在过程中受损。"))
    );
}
