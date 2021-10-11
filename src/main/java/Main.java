import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "ODk2NDY0NjA4MjU5MzU0NjQ0.YWHfug.MVD6xvZ31a0YFTubD6LRsPXtjlk";
        builder.setToken(token);
        builder.addEventListeners(new Main());
        builder.build();


    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println("We recived a message from " + event.getAuthor().getName() + ": " + event.getMessage().getContentDisplay());
        if(event.getMessage().getContentRaw().equals("!hej")){
            event.getChannel().sendMessage("Siema co tam").queue();
        }else System.out.println("Siema");
    }

}
