package com.livehereandnow.ages.field;

//import com.livehereandnow.ages.components.CardArray;
import com.livehereandnow.ages.card.Card;
import com.livehereandnow.ages.card.CardArray;
import com.livehereandnow.ages.card.CardBank;
import java.util.Collections;
import java.util.List;
//import com.livehereandnow.ages.components.Points;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mark
 */
public class Field {

    CardArray allCards;
    CardArray 卡牌列;
    CardArray 時代A內政牌;
    CardArray 時代I內政牌;
    CardArray 時代II內政牌;
    CardArray 時代III內政牌;
    CardArray 時代A軍事牌;
    CardArray 時代I軍事牌;
    CardArray 時代II軍事牌;
    CardArray 時代III軍事牌;
    CardArray 未來事件;
    CardArray 當前事件;

    FieldPlayer p1;
    FieldPlayer p2;
    FieldPlayer currentPlayer;

    Points round;

    public CardArray getAllCards() {
        return allCards;
    }

    public CardArray getCardRow() {
        return 卡牌列;
    }

    public CardArray get時代A內政牌() {
        return 時代A內政牌;
    }

    public CardArray get時代I內政牌() {
        return 時代I內政牌;
    }

    public CardArray get時代II內政牌() {
        return 時代II內政牌;
    }

    public CardArray get時代III內政牌() {
        return 時代III內政牌;
    }

    public CardArray get時代A軍事牌() {
        return 時代A軍事牌;
    }

    public CardArray get時代I軍事牌() {
        return 時代I軍事牌;
    }

    public CardArray get時代II軍事牌() {
        return 時代II軍事牌;
    }

    public CardArray get時代III軍事牌() {
        return 時代III軍事牌;
    }

    public CardArray get未來事件() {
        return 未來事件;
    }

    public CardArray get當前事件() {
        return 當前事件;
    }

    public FieldPlayer getP1() {
        return p1;
    }

    public FieldPlayer getP2() {
        return p2;
    }

    public FieldPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public Points getRound() {
        return round;
    }

    public Field() {
        this.init();
    }

    public void init() {
        allCards = new CardArray("All Cards");
        allCards = CardBank.getInstance().getAllCards();

        卡牌列 = new CardArray("卡牌列");
        時代A內政牌 = new CardArray("時代A內政牌");
        時代I內政牌 = new CardArray("時代I內政牌");
        時代II內政牌 = new CardArray("時代II內政牌");
        時代III內政牌 = new CardArray("時代III內政牌");
        時代A軍事牌 = new CardArray("時代A軍事牌");
        時代I軍事牌 = new CardArray("時代I軍事牌");
        時代II軍事牌 = new CardArray("時代II軍事牌");
        時代III軍事牌 = new CardArray("時代III軍事牌");
        未來事件 = new CardArray("未來事件");
        當前事件 = new CardArray("當前事件");

        round = new Points("回合");
        p1 = new FieldPlayer("max");
        p2 = new FieldPlayer("amy");
        currentPlayer = p1;

        Card card;
        List<Card> list;

        // 1
        card = allCards.getCardByName("哲學");
        p1.實驗室.add(card.copy());
        p2.實驗室.add(card.copy());
        allCards.remove(card);

        // 2
        card = allCards.getCardByName("宗教");
        p1.神廟區.add(card.copy());
        p2.神廟區.add(card.copy());
        allCards.remove(card);

//        農業  戰士
        card = allCards.getCardByName("青銅");
        p1.礦山區.add(card.copy());
        p2.礦山區.add(card.copy());
        allCards.remove(card);

        card = allCards.getCardByName("戰士");
        p1.步兵區.add(card.copy());
        p2.步兵區.add(card.copy());
        allCards.remove(card);
        card = allCards.getCardByName("農業");
        p1.農場區.add(card.copy());
        p2.農場區.add(card.copy());
        allCards.remove(card);

        card = allCards.getCardByName("專制");
        p1.政府區.add(card.copy());
        p2.政府區.add(card.copy());
        allCards.remove(card);

        list = allCards.getCardListCopy(0, "內政");
//        時代A內政牌.addAll(list);
//        allCards.removeAll(list);
        卡牌列.addAll(list);
         allCards.removeAll(list);
        
         //
         Collections.shuffle( 卡牌列);
         //
         卡牌列.remove(0);
         卡牌列.remove(0);
         卡牌列.remove(0);
         卡牌列.remove(0);
         
        
        
        list = allCards.getCardListCopy(0, "軍事");
        時代A軍事牌.addAll(list);
        allCards.removeAll(list);

        list = allCards.getCardListCopy(1, "內政");
        時代I內政牌.addAll(list);
        allCards.removeAll(list);

        list = allCards.getCardListCopy(1, "軍事");
        時代I軍事牌.addAll(list);
        allCards.removeAll(list);

        list = allCards.getCardListCopy(2, "內政");
        時代II內政牌.addAll(list);
        allCards.removeAll(list);
        list = allCards.getCardListCopy(2, "軍事");
        時代II軍事牌.addAll(list);
        allCards.removeAll(list);

        list = allCards.getCardListCopy(3, "內政");
        時代III內政牌.addAll(list);
        allCards.removeAll(list);
        list = allCards.getCardListCopy(3, "軍事");
        時代III軍事牌.addAll(list);
        allCards.removeAll(list);

        //
        allCards.add(new Card(1000, "", 4, "內政", "-", "-", "", "", "-", 1));
       
    }

    public void show() {
        round.show();
        System.out.println("Current Player: " + currentPlayer.name);
        allCards.show(1);

        卡牌列.show(1);
        時代A內政牌.show(1);
        時代I內政牌.show(1);
        時代II內政牌.show(1);
        時代III內政牌.show(1);
        時代A軍事牌.show(1);
        時代I軍事牌.show(1);
        時代II軍事牌.show(1);
        時代III軍事牌.show(1);
        未來事件.show(1);
        當前事件.show(1);
//        currentPlayer.show();
        p1.show();
        p2.show();
    }

    public final class FieldPlayer {

        public String getName() {
            return name;
        }

        public Points get內政點數() {
            return 內政點數;
        }

        public Points get軍事點數() {
            return 軍事點數;
        }

        public Points get建築上限() {
            return 建築上限;
        }

        public Points get內政手牌上限() {
            return 內政手牌上限;
        }

        public Points get軍事手牌上限() {
            return 軍事手牌上限;
        }

        public Points get殖民點數() {
            return 殖民點數;
        }

        public Points get文化() {
            return 文化;
        }

        public Points get文化生產_當回合() {
            return 文化生產_當回合;
        }

        public Points get科技() {
            return 科技;
        }

        public Points get科技生產_當回合() {
            return 科技生產_當回合;
        }

        public Points get軍力() {
            return 軍力;
        }

        public Points get資源庫_藍點() {
            return 資源庫_藍點;
        }

        public Points get人力庫_黃點() {
            return 人力庫_黃點;
        }

        public Points get笑臉_幸福指數() {
            return 笑臉_幸福指數;
        }

        public Points get工人區_黃點() {
            return 工人區_黃點;
        }

        public CardArray get領袖區() {
            return 領袖區;
        }

        public CardArray get政府區() {
            return 政府區;
        }

        public CardArray get實驗室() {
            return 實驗室;
        }

        public CardArray get神廟區() {
            return 神廟區;
        }

        public CardArray get農場區() {
            return 農場區;
        }

        public CardArray get礦山區() {
            return 礦山區;
        }

        public CardArray get步兵區() {
            return 步兵區;
        }

        public CardArray get建造中的奇蹟區() {
            return 建造中的奇蹟區;
        }

        public CardArray get已完成的奇蹟() {
            return 已完成的奇蹟;
        }

        public CardArray get殖民領土區() {
            return 殖民領土區;
        }

        public CardArray get特殊科技區() {
            return 特殊科技區;
        }

        public CardArray get手牌內政牌區() {
            return 手牌內政牌區;
        }

        public CardArray get手牌軍事牌區() {
            return 手牌軍事牌區;
        }

        public void setName(String name) {
            this.name = name;
        }

        public FieldPlayer(String str) {
            name = str;
            init();
        }

        private String name;
        private Points 內政點數;
        private Points 軍事點數;
        private Points 建築上限;
        private Points 內政手牌上限;
        private Points 軍事手牌上限;
        private Points 殖民點數;
        private Points 文化;
        private Points 文化生產_當回合;
        private Points 科技;
        private Points 科技生產_當回合;
        private Points 軍力;
        private Points 資源庫_藍點;
        private Points 人力庫_黃點;
        private Points 笑臉_幸福指數;
        private Points 工人區_黃點;
        private CardArray 領袖區;
        private CardArray 政府區;
        private CardArray 實驗室;
        private CardArray 神廟區;
        private CardArray 農場區;
        private CardArray 礦山區;
        private CardArray 步兵區;
        private CardArray 建造中的奇蹟區;
        private CardArray 已完成的奇蹟;
        private CardArray 殖民領土區;
        private CardArray 特殊科技區;
        private CardArray 手牌內政牌區;
        private CardArray 手牌軍事牌區;

        public void init() {
            內政點數 = new Points("內政點數");
            軍事點數 = new Points("軍事點數");
            建築上限 = new Points("建築上限");
            內政手牌上限 = new Points("內政手牌上限");
            軍事手牌上限 = new Points("軍事手牌上限");
            殖民點數 = new Points("殖民點數");
            文化 = new Points("文化");
            文化生產_當回合 = new Points("文化生產_當回合");
            科技 = new Points("科技");
            科技生產_當回合 = new Points("科技生產_當回合");
            軍力 = new Points("軍力");
            資源庫_藍點 = new Points("資源庫_藍點");
            人力庫_黃點 = new Points("人力庫_黃點");
            笑臉_幸福指數 = new Points("笑臉_幸福指數");
            工人區_黃點 = new Points("工人區_黃點");
            領袖區 = new CardArray("領袖區");
            政府區 = new CardArray("政府區");
            實驗室 = new CardArray("實驗室");
            神廟區 = new CardArray("神廟區");
            農場區 = new CardArray("農場區");
            礦山區 = new CardArray("礦山區");
            步兵區 = new CardArray("步兵區");
            建造中的奇蹟區 = new CardArray("建造中的奇蹟區");
            已完成的奇蹟 = new CardArray("已完成的奇蹟");
            殖民領土區 = new CardArray("殖民領土區");
            特殊科技區 = new CardArray("特殊科技區");
            手牌內政牌區 = new CardArray("手牌內政牌區");
            手牌軍事牌區 = new CardArray("手牌軍事牌區");
        }

        public void show() {
            System.out.println("=== " + name + " ===");
            內政點數.show();
            軍事點數.show();
            建築上限.show();
            內政手牌上限.show();
            軍事手牌上限.show();
            殖民點數.show();
            文化.show();
            文化生產_當回合.show();
            科技.show();
            科技生產_當回合.show();
            軍力.show();
            資源庫_藍點.show();
            人力庫_黃點.show();
            笑臉_幸福指數.show();
            工人區_黃點.show();
            領袖區.show(2);
            政府區.show(2);
            實驗室.show(2);
            神廟區.show(2);
            農場區.show(2);
            礦山區.show(2);
            步兵區.show(2);
            建造中的奇蹟區.show(1);
            已完成的奇蹟.show(1);
            殖民領土區.show(1);
            特殊科技區.show(1);
            手牌內政牌區.show(1);
            手牌軍事牌區.show(1);
        }
    }
}
