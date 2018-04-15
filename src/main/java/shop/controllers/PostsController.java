package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shop.models.Post;
import shop.services.NotificationService;
import shop.services.NotificationServiceImpl;
import shop.services.PostService;

import java.util.LinkedList;

@Controller
public class PostsController {
    @Autowired
    private PostService postService;
    @Autowired
    private NotificationServiceImpl notificationService;

    @RequestMapping("posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model, LinkedList<Post> latest5posts) {
        Post post = postService.findById(id);
        if (post == null) {
            notificationService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
        model.addAttribute("post", post);
        model.addAttribute("latest5posts", postService.findLatest5());

        return "posts/view";

    }
}
