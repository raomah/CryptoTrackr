import SwiftUI

@main
struct CryptoTrackrApp: App {
    @StateObject private var viewModel = HomeViewModel()
    var body: some Scene {
        WindowGroup {
            NavigationView{
                HomeView()
                    .navigationBarHidden(true)
            }.environmentObject(viewModel)
        }
    }
}
